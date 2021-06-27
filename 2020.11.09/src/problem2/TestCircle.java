package problem2;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(13);
		System.out.println(circle1.getPerimeter());
		circle2.setRadius(10);
		System.out.println(circle2.getArea());
	}

}
