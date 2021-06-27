package problem2;

public class Fan {

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	public Fan() {
		speed = SLOW;
		switchedOn = false;
		radius = 5;
		color = "blue";
	}
	
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the switchedOn
	 */
	public boolean isSwitchedOn() {
		return switchedOn;
	}

	/**
	 * @param switchedOn the switchedOn to set
	 */
	public void setSwitchedOn(boolean switchedOn) {
		this.switchedOn = switchedOn;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String description = "Fan: ";
		if(switchedOn==true) {
			description+="speed "+speed+", color "+color+", radius "+radius;
			
		}else {
			description+="color "+color+", radius "+radius+", the fan is off";
			
		}
		return description;
	}
}
