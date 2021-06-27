package problem2;

import java.util.Scanner;

import problem1.GeometricObject;
import problem1.Square;
import problem1.Triangle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		GeometricObject[] arr = new GeometricObject[4];
		for (int i = 0; i < 2; i++) {
			System.out.println("Side of square" + (i + 1) + ": ");
			arr[i] = new Square(sc.nextDouble());
		}
		for (int i = 2; i < 4; i++) {
			System.out.println("Side of triangle" + (i - 1) + ": ");
			arr[i] = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		}
		System.out.println("Total area: " + sumArea(arr));
	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (GeometricObject object : a) {
			sum += object.getArea();
		}
		return sum;
	}
}
