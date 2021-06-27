package problem1;

public class Faculty extends Employee {

	int officeHours;
	String rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired, int officeHours, String rank) {
		super(name, address, phoneNumber, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Office hours:\t"+officeHours+"\nRank:\t\t"+rank+"\n";
	}
}
