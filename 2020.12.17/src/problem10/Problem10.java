package problem10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number;
		String[] months = { "Januray", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.print("Enter a month (integer between 1 and 12): ");
		try {
			number = sc.nextInt();
			if (number > 0 && number < 13) {
				System.out.println(months[number-1]+" has "+dom[number-1]+" days.");
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Wrong number");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception");
		}
	}

}
