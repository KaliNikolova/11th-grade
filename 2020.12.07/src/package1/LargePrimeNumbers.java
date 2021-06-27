package package1;

import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long l = Long.MAX_VALUE;
		BigInteger n = new BigInteger(l.toString());
		short i =0;
		while(i<5) {
			n=n.add(BigInteger.ONE);
			
			if(isPrime(n)) {
				i++;
				System.out.println(n);
			}
		}
	}
	
	public static boolean isPrime(BigInteger n) {
		for(BigInteger i=new BigInteger("2");i.compareTo(n)<0;i=i.add(BigInteger.ONE)) {
			if(n.remainder(i).equals(BigInteger.ZERO)) return false;
		}
		return true;
	}
}
