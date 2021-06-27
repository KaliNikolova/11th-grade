package problem1;


public class MyInteger {

	private int value;
	
	MyInteger (int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		if (value%2==0) return true;
		return false;
	}
	public boolean isOdd() {
		if (value%2==1) return true;
		return false;
	}
	public boolean isPrime() {
		for(int i=2;i<=value/2;i++) {
			if(value%i==0) return false;
		}
		return true;
	}
	public static boolean isEven(int value) {
		if (value%2==0) return true;
		return false;
	}
	public static boolean isOdd(int value) {
		if (value%2==1) return true;
		return false;
	}
	public static boolean isPrime(int value) {
		for(int i=2;i<=value/2;i++) {
			if(value%i==0) return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger obj) {
		if (obj.getValue()%2==0) return true;
		return false;
	}
	public static boolean isOdd(MyInteger obj) {
		if (obj.getValue()%2==1) return true;
		return false;
	}
	public static boolean isPrime(MyInteger obj) {
		for(int i=2;i<=obj.getValue()/2;i++) {
			if(obj.getValue()% i==0) return false;
		}
		return true;
	}
	public boolean equals(int value) {
		if(this.value==value) return true;
		return false;
	}
	public boolean equals(MyInteger obj) {
		if(obj.getValue()==value) return true;
		return false;
	}
	public static int parseInt(char[] array) {
		int number=0;
		int stepen=1;
		int ch;
		for(int i=0;i<array.length;i++) {
			ch=(int)(array[array.length-i-1]-'0');
			if(ch>9||ch<0) return 0;
			number+=ch*stepen;
			stepen*=10;
		}
		return number;
	}
	public static int parseInt(String str) {
		return parseInt(str.toCharArray());
	}
}
