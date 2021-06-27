package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean b = true;
		double side1 = 1.0, side2 = 1.0, side3 = 1.0;
		System.out.println("This program creates triangle object.");
		do {
			System.out.print("Enter the length of the first side: ");
			do {
				try {
					side1 = sc.nextDouble();
					if (side1 <= 0) {
						throw new Exception();
					}
					b = false;
				} catch (InputMismatchException ex) {
					System.out.print("Wrong input. Enter a number of type double: ");
					sc.next();
				} catch (Exception ex) {
					System.out.print("Wrong input. Enter a number bigger than 0: ");
				
				}
			} while (b);

			System.out.print("Enter the length of the second side: ");
			b = true;
			do {
				try {
					side2 = sc.nextDouble();
					if (side2 <= 0) {
						throw new Exception();
					}
					b = false;
				} catch (InputMismatchException ex) {
					System.out.print("Wrong input. Enter a number of type double: ");
					sc.next();
				} catch (Exception ex) {
					System.out.print("Wrong input. Enter a number bigger than 0: ");
				
				}
			} while (b);
			System.out.print("Enter the length of the third side: ");
			b = true;
			do {
				try {
					side3 = sc.nextDouble();
					if (side3 <= 0) {
						throw new Exception();
					}
					b = false;
				} catch (InputMismatchException ex) {
					System.out.print("Wrong input. Enter a number of type double: ");
					sc.next();
				} catch (Exception ex) {
					System.out.print("Wrong input. Enter a number bigger than 0: ");
					
				}
			} while (b);
			if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
				System.out.println(
						"Enter side lengths of an existing triangle. Every side should be smaller than the sum of the other two.");
				b = true;
			}
		} while (b);
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.println(triangle.printTriangle());
		System.out.print("Enter the color of the triangle: ");
		String color = sc.next();
		triangle.setColor(color);
		System.out.println("Is the triangle filled (enter true or false): ");
		b = true;
		boolean filled = false;
		do {
			try {
				filled = sc.nextBoolean();
				b=false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Wrong input. Is the triangle filled? (Write \"true\" or \"false\")");
				sc.next();
			}
		}while(b);
		triangle.setFilled(filled);
		System.out.printf("Area: \t\t%1.2f\nPerimeter: \t%1.2f \nColor: \t\t%s\nFilled: \t%b", triangle.getArea(), triangle.getPerimeter(), triangle.getColor(), triangle.isFilled());
	}

}
