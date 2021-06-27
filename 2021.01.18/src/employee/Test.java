package employee;
import employee.Personnel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personnel.addDeveloper("Kali", 2000, 5, false, true);
		Personnel.addManager("Sofi", 3000, 13, 4);
		Personnel.addDeveloper("Persi", 2500, 15, true, true);
		Personnel.remove("Persi");
		System.out.println(Personnel.personnelToString());
		System.out.println("Total monthly expense: "+Personnel.totalMonthlyExpense());
		Personnel.addDeveloper("Persi", 2500, 15, true, true);
		System.out.println("\n"+Personnel.personnelToString());
		System.out.println("Total monthly expense: "+Personnel.totalMonthlyExpense());
	}

}
