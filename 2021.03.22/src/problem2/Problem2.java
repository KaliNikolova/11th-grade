package problem2;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();
		int[] products = new int[m];
		int[][] clients = new int[m][k];

		int productsOfNextClient = 1;
		int minIndex;
		for (int i = 0; i < n; i++) {
			minIndex = minIndexProducts(products);
			products[minIndex] += productsOfNextClient;
			clients[minIndex][productsOfNextClient-1]++;
			if(productsOfNextClient == k) productsOfNextClient =0;
			productsOfNextClient++;
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<k;j++) {
				System.out.print(clients[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int minIndexProducts(int [] products) {
		int min=0;
		for(int i=0;i<products.length;i++) {
			if(products[min] > products[i]) min = i;
		}
		return min;
	}
}
