package problem2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int value = 50;
			if (value < 40)
				throw new Exception("value is too small");
			catc(new Exception("Murm e mnogo fkusna"));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Continue after the catch block");
	}

	static void catc(String s) {
		System.out.println(s);
	}
	static void catc(Exception ex) {
		System.out.println(ex.getMessage());
	}

}
