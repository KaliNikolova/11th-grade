package employee;

public class Manager extends Employee {
	private int numberOfManagedPeople;
	
	public Manager(String name, double salary, int monthsOfWork, int numberOfManagedPeople){
		super(name, salary, monthsOfWork);
		this.numberOfManagedPeople = numberOfManagedPeople;
	}
	@Override
	public String toString() {
		return super.toString()+"Number of managed people:\t"+numberOfManagedPeople+"\n\n";
	}
}
