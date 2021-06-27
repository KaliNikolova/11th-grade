import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		HashSet<Integer> set = new HashSet<Integer>();
		int i = 2;
		while (n > 1) {
			if (n % i == 0) {
				n /= i;
				set.add(i);
			}
			if(n%i != 0) i++;
		}
		if(set.size() ==1 && set.contains(copy)) System.out.println("It is a prime number");
		else {
			System.out.println("It is not a prime number");
			System.out.println(Arrays.toString(set.toArray()));
		}
	}

}
