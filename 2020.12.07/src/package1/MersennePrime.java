package package1;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BigInteger mersenne = BigInteger.ONE;
		BigInteger two = new BigInteger("2");
		for(int p=1;p<=100;p++) {
			mersenne = mersenne.multiply(two);
			if(isPrime(p)) {
				System.out.println("p = "+p+"\t2^p-1 = "+mersenne.subtract(BigInteger.ONE));
			}
		}
	}


	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		if (n==1) return false;
		return true;
	}
}
