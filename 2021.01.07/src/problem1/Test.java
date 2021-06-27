package problem1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person("Kali", "Sofia", "+359 88 0000000", "kali@gmail.com");
		System.out.println(person.toString());
		Student student = new Student("Sofi", "Sofia", "+359 88 0000000", "sofi@gmail.com", ClassStatus.FRESHMAN);
		System.out.println(student.toString());
		Employee employee = new Employee("George", "Sofia", "+359 88 0000000", "george@gmail.com", "Office 1", 3000, "02.10.2018");
		System.out.println(employee.toString());
		Faculty faculty = new Faculty("George", "Sofia", "+359 88 0000000", "george@gmail.com", "Office 1", 3000, "02.10.2018", 8, "Professor");
		System.out.println(faculty.toString());
		Staff staff = new Staff("George", "Sofia", "+359 88 0000000", "george@gmail.com", "Office 1", 3000, "02.10.2018", "Manager");
		System.out.println(staff.toString());
		
	}

}
