package problem2;

public class MyPoint {

	private double x;
	private double y;

	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public MyPoint() {
		x=0;
		y=0;
	}
	public MyPoint(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double distance(MyPoint point) {
		double dx =x-point.x;
		double dy = y-point.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public double distance(double x, double y) {
		double dx =x-this.x;
		double dy = y-this.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	public static double distance(MyPoint p1, MyPoint p2) {
		double dx =p1.x-p2.x;
		double dy = p1.y-p2.y;
		return Math.sqrt(dx*dx+dy*dy);
	}
}
