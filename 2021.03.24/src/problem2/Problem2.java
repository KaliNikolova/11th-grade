package problem2;

import java.text.Format;
import java.util.Scanner;
import java.util.Stack;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numOfSigns = sc.nextInt();
		int km = sc.nextInt();
		int[] signKM = new int[numOfSigns];
		int[] signSpeed = new int[numOfSigns];
		for (int i = 0; i < numOfSigns; i++) {
			signKM[i] = sc.nextInt();
			signSpeed[i] = sc.nextInt();
		}

		Stack<Integer> speed = new Stack<>();
		speed.push(80);
		int razstoqnie;
		double time = 0;
		for (int i = 0; i < numOfSigns; i++) {
			razstoqnie = signKM[i] - (i == 0 ? 0 : signKM[i - 1]);
			time+= (double)razstoqnie/speed.peek();

			if (signSpeed[i] == -1)
				speed.pop();
			else
				speed.push(signSpeed[i]);
		}
		time += (double)(km - signKM[signKM.length-1])/80;
		System.out.println(String.format("%.2f", time));
	}

}
