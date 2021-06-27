package problem2;

public class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setColor("yellow");
		fan1.setRadius(10);
		fan1.setSpeed(fan1.FAST);
		fan1.setSwitchedOn(true);
		fan2.setColor("blue");
		fan2.setRadius(5);
		fan2.setSpeed(fan1.MEDIUM);
		fan2.setSwitchedOn(false);
		System.out.println(fan1.toString());
		System.out.println(fan2.toString());
	}

}
