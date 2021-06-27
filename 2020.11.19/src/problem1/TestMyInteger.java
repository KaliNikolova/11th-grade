package problem1;

public class TestMyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyInteger obj = new MyInteger(10);
		MyInteger obj2 = new MyInteger(18);
		char[] array = {'1','2','3'};
		System.out.println(obj.getValue());
		System.out.println(obj.isEven());
		System.out.println(obj.isOdd());
		System.out.println(obj.isPrime());
		System.out.println(MyInteger.isEven(7));
		System.out.println(MyInteger.isOdd(7));
		System.out.println(MyInteger.isPrime(7));
		System.out.println(MyInteger.isEven(obj2));
		System.out.println(MyInteger.isOdd(obj2));
		System.out.println(MyInteger.isPrime(obj2));
		System.out.println(obj.equals(7));
		System.out.println(obj.equals(10));
		System.out.println(obj.equals(obj2));
		System.out.println(MyInteger.parseInt(array));
		System.out.println(MyInteger.parseInt("23234231212211128640"));
	}

}
