package problem7;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Object o = new Object();
			String s = (String) o;
		}
		catch (ClassCastException ex){
			System.out.println("ClassCastException");
		}
		finally {
			System.out.println("Done");
		}
	}

}
