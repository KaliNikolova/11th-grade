
public class Complex implements Cloneable, Comparable<Complex>{

	private double real;
	private double imaginary;

	public Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	public Complex(double real) {
		this.real = real;
		imaginary =0;
	}
	public Complex() {
		real = 0;
		imaginary = 0;
	}

	public Complex add(Complex c) {
		return new Complex(this.real + c.real, this.imaginary + c.imaginary);
	}

	public Complex substract(Complex c) {
		return new Complex(this.real - c.real, this.imaginary - c.imaginary);
	}

	public Complex multiply(Complex c) {
		return new Complex(this.real * c.real - this.imaginary * c.imaginary,
				this.imaginary * c.real + this.real * c.imaginary);
	}

	public Complex divide(Complex c) {
		return new Complex(
				(this.real * c.real + this.imaginary * c.imaginary) / (c.imaginary * c.imaginary + c.real * c.real),
				(this.imaginary * c.real - this.real * c.imaginary) / (c.real * c.real + c.imaginary * c.imaginary));
	}

	public double abs() {
		return Math.sqrt(real * real + imaginary * imaginary);
	}

	@Override
	public String toString() {
		if(imaginary==0) return "("+real+")";
		return "("+real + " + " + imaginary + "i)";
	}

	@Override
	public int compareTo(Complex o) {
		if(this.abs()>o.abs()) return 1;
		if(this.abs()< o.abs()) return -1;
		return 0;
	}
	@Override
	public Complex clone() {
		return new Complex(real, imaginary);
		
	}
	
	public double getRealPart() {
		return real;
	}
	public double getImaginaryPart() {
		return imaginary;
	}
}
