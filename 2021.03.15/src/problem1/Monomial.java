package problem1;

public class Monomial {
	private double coefficient;
	private int power;
	
	public Monomial(double coefficient, int power) {
		// TODO Auto-generated constructor stub
		if(coefficient != 0 && power>=0) {
			this.coefficient = coefficient;
			this.power = power;
		}
	}

	/**
	 * @return the coefficient
	 */
	public double getCoefficient() {
		return coefficient;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}
	
	public void reverse(Monomial m) {
		int p = m.power;
		double c = m.coefficient;
		m.power = this.power;
		m.coefficient = this.coefficient;
		this.power = p;
		this.coefficient = c;
	}
}
