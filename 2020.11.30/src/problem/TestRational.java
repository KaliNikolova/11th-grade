package problem;

public class TestRational {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rational r1 = new Rational();
		r1.setNum(2);
		r1.setDenum(3);
		Rational r2 = new Rational(4,5);
		System.out.println(r2.getNum()+"/"+r2.getDenum());
		Rational rAdd = r1.add(r2);
		Rational rSub = r1.sub(r2);
		Rational rMult = r1.mult(r2);
		rAdd.print();
		System.out.println(rSub.dec());
		System.out.println(rMult.dec());
		r1.div(r1).print();
		System.out.println(r1.compare(rMult));
		Rational r = new Rational(15,20);
		r.oprostqvane();
		r.print();
	}

}
