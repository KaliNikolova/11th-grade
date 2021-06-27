package package1;

import java.math.BigInteger;

public class DivisibleBy5Or6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Long l = Long.MAX_VALUE;
		BigInteger number = new BigInteger(l.toString());
		for(int i = 0; i<10;) {
			number = number.add(BigInteger.ONE);
			if(number.remainder(new BigInteger(5+"")).equals(BigInteger.ZERO)) {
				i++;
				System.out.println(number);
			}
			else if(number.remainder(new BigInteger(6+"")).equals(BigInteger.ZERO)) {
				i++;
				System.out.println(number);
			}
		}
	}

}
