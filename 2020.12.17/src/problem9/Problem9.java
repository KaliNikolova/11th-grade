package problem9;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int[] array = new int[10];
			for(int i=0;i<20;i++) {
				array[i] = i;
				System.out.println(array[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
		
	}

}
