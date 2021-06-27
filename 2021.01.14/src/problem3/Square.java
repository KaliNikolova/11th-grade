package problem3;

public class Square extends GeometricObject implements Colorable{

	private double side;
	
	public Square() {
		side=0;
	}
	public Square(double side) {
		this.side = side;
	}
	
	/**
	 * @return the side
	 */
	public double getSide() {
		return side;
	}
	/**
	 * @param side the side to set
	 */
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public void howToColor() {
		// TODO Auto-generated method stub
		System.out.println( "Color all four sides");
	}
	public double getArea() {
		return side*side;
	}
}
