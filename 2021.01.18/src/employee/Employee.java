package employee;

public class Employee {

	private String name;
	private double salary;
	private int monthsOfWork;
	
	protected Employee(String name, double salary, int monthsOfWork) {
		this.name = name;
		this.salary = salary;
		this.monthsOfWork = monthsOfWork;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getMonthsOfWork() {
		return monthsOfWork;
	}
	
	public String toString() {
		return "Name:\t\t"+name+"\nMonths of work:\t"+ monthsOfWork+"\nSalary:\t\t"+salary+"\n";
	}
}
