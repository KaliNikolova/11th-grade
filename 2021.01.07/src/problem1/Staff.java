package problem1;

public class Staff extends Employee{

	String title;
	
	public Staff(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired, String title) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.title = title;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Title:\t\t"+title+"\n";
	}
}
