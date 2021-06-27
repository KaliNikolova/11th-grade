package problem1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Side of square1: ");
		Square square1 = new Square(sc.nextDouble());
		System.out.print("Side of square2: ");
		Square square2 = new Square(sc.nextDouble());
		System.out
				.println(square1 == GeometricObject.max(square1, square2) ? "Square1 is bigger" : "Square2 is bigger");
		System.out.print("Sides of triangle1: ");
		Triangle triangle1 = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.print("Sides of triangle2: ");
		Triangle triangle2 = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
		System.out.println(
				triangle1 == GeometricObject.max(triangle1, triangle2) ? "Triangle1 is bigger" : "Triangle2 is bigger");

		System.out.println("Create an array list of 5 tringles");
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		for (int i = 0; i < 5; i++) {
			System.out.println("Sides of triangle" + i + ": ");
			triangles.add(new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
		}

		Collections.sort(triangles);
		for (Triangle triangle : triangles) {
			System.out.println(triangle.toString());
		}
	}

}
