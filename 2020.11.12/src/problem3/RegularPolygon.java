package problem3;

public class RegularPolygon {

	private int n;
	private double sideLength;
	private double x;
	private double y;
	
	public RegularPolygon() {
		n=3;
		sideLength =1;
		x=0;
		y=0;
	}
	public RegularPolygon(int n, double sideLength) {
		this.n = n;
		this.sideLength = sideLength;
		x=0;
		y=0;
	}
	public RegularPolygon(int n, double sideLength, double x, double y) {
		this.n = n;
		this.sideLength = sideLength;
		this.x=x;
		this.y=y;
	}
	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}
	/**
	 * @param n the n to set
	 */
	public void setN(int n) {
		this.n = n;
	}
	/**
	 * @return the sideLength
	 */
	public double getSideLength() {
		return sideLength;
	}
	/**
	 * @param sideLength the sideLength to set
	 */
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	/**
	 * @return the x
	 */
	public double getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public double getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return (n*sideLength);
	}
	public double getArea() {
		return (n*sideLength*sideLength/4/Math.tan(Math.PI/n));
	}
}
