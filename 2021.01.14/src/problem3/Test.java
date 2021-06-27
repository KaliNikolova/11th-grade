package problem3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Square[] squares = new Square[5];
		for(int i=0;i<squares.length;i++) {
			System.out.println("Create new square.");
				System.out.print("Side of the square: ");
				squares[i] = new Square(sc.nextDouble());
				System.out.println("The area of square "+(i+1)+" is "+squares[i].getArea());
				if(squares[i] instanceof Colorable) {
					squares[i].howToColor();
				}
				System.out.println();
		}
	}

}
