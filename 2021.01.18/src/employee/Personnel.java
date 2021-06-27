package employee;

import java.util.ArrayList;

public class Personnel {

	private static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void addDeveloper(String name, double salary, int monthsOfWork, boolean knowsCpp, boolean knowsJava) {
		employees.add(new  Developer(name, salary, monthsOfWork, knowsCpp, knowsJava));
	}
	public static void addManager(String name, double salary, int monthsOfWork, int numberOfManagedPeople) {
		employees.add(new Manager(name, salary, monthsOfWork, numberOfManagedPeople));
	}
	public static void remove(String name) {
		for(Employee e: employees) {
			if((e.getName()).equals(name)) e.setSalary(0);;
		}
	}
	public static double totalMonthlyExpense() {
		double sum=0;
		for(Employee e: employees) {
			sum+= e.getSalary();
		}
		return sum;
	}
	public static String personnelToString() {
		String s="";
		for(Employee e: employees) {
			if(e.getSalary()>0) {
			s+=e.toString();
				
			}
		}
		return s;
	}
}
