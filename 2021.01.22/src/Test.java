import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter the first complex number: ");
		Scanner sc = new Scanner(System.in);
		Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
		System.out.print("Enter the second complex number: ");
		Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
		System.out.println(c1.toString()+" + "+ c2.toString()+" = "+ c1.add(c2).getRealPart()+" + "+c1.add(c2).getImaginaryPart()+"i");
		System.out.println(c1.toString()+" - "+ c2.toString()+" = "+ c1.substract(c2).getRealPart()+" + "+c1.substract(c2).getImaginaryPart()+"i");
		System.out.println(c1.toString()+" * "+ c2.toString()+" = "+ c1.multiply(c2).getRealPart()+" + "+c1.multiply(c2).getImaginaryPart()+"i");
		System.out.println(c1.toString()+" / "+ c2.toString()+" = "+ c1.divide(c2).getRealPart()+" + "+c1.divide(c2).getImaginaryPart()+"i");
		System.out.println("|"+c1+"| = "+c1.abs());
		
	}

}
