package problem1;

import java.util.LinkedList;
import java.util.Scanner;

public class Polynomial {

	private LinkedList<Monomial> polynomial = new LinkedList<>();

	public static Polynomial create() {
		Polynomial obj = new Polynomial();
		double coeff = 0;
		int pow = 0;
		System.out.println("Create a polynomial. When you are ready, set the power -1");
		Scanner sc = new Scanner(System.in);
		while (pow >= 0) {
			if (coeff > 0)
				obj.polynomial.add(new Monomial(coeff, pow));
			System.out.print("\nCoefficient: ");
			coeff = sc.nextDouble();
			System.out.print("Power: ");
			pow = sc.nextInt();
		}
		obj = sort(obj);
		return obj;
	}

	public static void print(Polynomial obj) {
		String str = "";
		for (Monomial m : obj.polynomial) {
			str += String.format("%.2f", m.getCoefficient()) + "*x^" + m.getPower() + " + ";
		}
		str = str.substring(0, str.length() - 2);
		System.out.println(str+"\n");
	}

	public static Polynomial sort(Polynomial obj) {
		for (int i = 0; i < obj.polynomial.size(); i++) {
			for (int j = i + 1; j < obj.polynomial.size(); j++) {
				if (obj.polynomial.get(i).getPower() < obj.polynomial.get(j).getPower())
					obj.polynomial.get(i).reverse(obj.polynomial.get(j));
			}
		}
		return obj;
	}

	public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
		Polynomial p = new Polynomial();
		int i1 = 0;
		int i2 = 0;
		Monomial m1;
		Monomial m2;
		while (i1 + i2 < p1.polynomial.size() + p2.polynomial.size()) {
			if (i1 >= p1.polynomial.size()) {
				p.polynomial.add(p2.polynomial.get(i2));
				i2++;
			} else if (i2 >= p2.polynomial.size()) {
				p.polynomial.add(p1.polynomial.get(i1));
				i1++;
			} else {
				m1 = p1.polynomial.get(i1);
				m2 = p2.polynomial.get(i2);
				if (m1.getPower() > m2.getPower()) {
					p.polynomial.add(m1);
					i1++;
				} else if (m1.getPower() < m2.getPower()) {
					p.polynomial.add(m2);
					i2++;
				} else {
					p.polynomial.add(new Monomial(m1.getCoefficient() + m2.getCoefficient(), m1.getPower()));
					i1++;
					i2++;
				}
			}
		}
		sort(p);
		return p;
	}
	
	public static Polynomial multPolynomialMonomial (Monomial m, Polynomial p) {
		Polynomial result = new Polynomial();
		double coeff = m.getCoefficient();
		int pow = m.getPower();
		for(Monomial element: p.polynomial) {
			result.polynomial.add(new Monomial(element.getCoefficient()*coeff, pow+element.getPower()));
		}
		return result;
	}
	
	public static Polynomial multPolynomials (Polynomial p1, Polynomial p2) {
		Polynomial result = null;
		for(Monomial m: p1.polynomial) {
			if(result == null) result = multPolynomialMonomial(m, p2);
			else {
				result = addPolynomials(result, multPolynomialMonomial(m, p2));
			}
		}
		return result;
	}
}
