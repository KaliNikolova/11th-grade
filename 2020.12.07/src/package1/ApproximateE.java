package package1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ApproximateE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=100;i<=1000;i+=100) {
			System.out.println("i = "+i+"   e = "+e(i));
		}
	}

	public static BigInteger factorial(long n) {
		BigInteger result = BigInteger.ONE;
		for (long i = 1; i <= n; i++) {
			result = result.multiply(new BigInteger(i + ""));
		}
		return result;
	}

	public static BigDecimal e(int i) {
		BigDecimal result = BigDecimal.ONE;
		result = result.setScale(25, BigDecimal.ROUND_HALF_UP);
		for (int j = 1; j <= i; j++) {
			BigDecimal f = new BigDecimal(factorial(j).toString());
			BigDecimal b = BigDecimal.ONE;
			b = b.setScale(50, BigDecimal.ROUND_HALF_UP);
			b = b.divide(f, BigDecimal.ROUND_HALF_UP);
			result = result.add(b);
			//System.out.println("f=" + f + "\tb=" + b + "\tr=" + result);
		}
		return result;
	}
}
