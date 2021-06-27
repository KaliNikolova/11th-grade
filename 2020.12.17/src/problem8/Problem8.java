package problem8;

public class Problem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Problem8 o = null;
		try {
			o.method();
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointerException");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
	}

	void method() {
		System.out.println("In the method");
	}
}
