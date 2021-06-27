package problem1;

public class Employee extends Person {

	String office;
	int salary;
	String dateHired;
	
	public Employee(String name, String address, String phoneNumber, String email, String office, int salary, String dateHired) {
		super(name, address, phoneNumber, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Office:\t\t"+office+"\nSalary:\t\t"+salary+"\nDate hired:\t"+dateHired+"\n";
	}
}
