package employee;

public class Developer extends Employee {

	private boolean knowsCpp;
	private boolean konwsJava;
	
	public Developer(String name, double salary, int monthsOfWork, boolean knowsCpp, boolean knowsJava){
		super(name, salary, monthsOfWork);
		this.knowsCpp = knowsCpp;
		this.konwsJava = knowsJava;
	}
	@Override
	public String toString() {
		String ret = super.toString()+ "C++:\t\t";
		ret += knowsCpp ? "Yes": "No";
		ret += "\nJava:\t\t";
		ret += konwsJava ? "Yes": "No";
		return ret+"\n\n";
	}
}
