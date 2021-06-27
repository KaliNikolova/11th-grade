package problem1;

import java.util.Scanner;

public class GeometricObject {

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
		 return "GeometricObject: color: " + color +  " and filled: " + filled;
	}
}
