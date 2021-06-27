package problem1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Polynomial p1 = Polynomial.create();
		Polynomial.print(p1);
		Polynomial p2 = Polynomial.create();
		Polynomial.print(p2);
		System.out.print("Sum:\t\t");
		Polynomial.print(Polynomial.addPolynomials(p1, p2));
		System.out.print("Product:\t");
		Polynomial.print(Polynomial.multPolynomials(p1, p2));
	}

}
