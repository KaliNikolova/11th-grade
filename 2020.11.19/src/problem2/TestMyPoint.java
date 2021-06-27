package problem2;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(4,3);
		System.out.println(p1.getX());
		System.out.println(p2.getY());
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(1,1));
		System.out.println(MyPoint.distance(p1,p2));
	}

}
