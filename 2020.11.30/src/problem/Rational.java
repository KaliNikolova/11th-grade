package problem;

public class Rational {

	private int num;
	private int denum;
	
	public Rational() {
		num = 1;
		denum = 1;
	}
	public Rational(int num, int denum) {
		this.num = num;
		this.denum = denum;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDenum() {
		return denum;
	}
	public void setDenum(int denum) {
		this.denum = denum;
	}
	
	public Rational add(Rational r) {
		int newNum = r.denum*this.num + r.num*this.denum;
		int newDenum = r.denum*this.denum;
		Rational newR = new Rational(newNum, newDenum);
		newR.oprostqvane();
		return newR;
	}
	public Rational sub(Rational r) {
		int newNum = r.denum*this.num - r.num*this.denum;
		int newDenum = r.denum*this.denum;
		Rational newR = new Rational(newNum, newDenum);
		newR.oprostqvane();
		return newR;
	}
	public Rational mult(Rational r) {
		int newNum = this.num * r.num;
		int newDenum = r.denum*this.denum;
		Rational newR = new Rational(newNum, newDenum);
		newR.oprostqvane();
		return newR;
	}
	public Rational div(Rational r) {
		int newNum = r.denum*this.num;
		int newDenum = r.num*this.denum;
		Rational newR = new Rational(newNum, newDenum);
		newR.oprostqvane();
		return newR;
	}
	
	public short compare(Rational r) {
		if(this.dec()>r.dec()) return 1;
		if(this.dec()==r.dec()) return 0;
		return -1;
	}
	
	public double dec() {
		return (double)num/denum;
	}
	public void print() {
		System.out.println("Rational number: "+this.num+"/"+this.denum);
	}
	public void oprostqvane() {
		for(int i=2;i<=Math.min(denum, num);i++) {
			if(denum%i==0&&num%i==0) {
				denum/=i;
				num/=i;
			}
		}
	}
}
