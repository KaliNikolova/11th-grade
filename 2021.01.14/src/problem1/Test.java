package problem1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.m1();
	}

}
interface A {
	 void m1();
	}
	class B implements A {
	 public void m1() {
	 System.out.println("m1");
	 }
	}

