package problem1;

import java.util.Scanner;

public abstract class GeometricObject implements Comparable {

	private String color;
	private boolean filled;
	private Scanner sc = new Scanner(System.in);

	public GeometricObject() {
		color = "black";
		filled = false;
	}

	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public abstract double getArea();

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		return "GeometricObject: color: " + color + " and filled: " + filled;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof GeometricObject) {
			if (((GeometricObject) o).getArea() > this.getArea())
				return -1;
			if (((GeometricObject) o).getArea() < this.getArea())
				return 1;
		}
		return 0;
	}

	public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
		if (obj1.getArea() > obj2.getArea())
			return obj1;
		return obj2;
	}
}
