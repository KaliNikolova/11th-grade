package problem2;

import java.time.LocalDate;

public class OESR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student("Alex");
		Student student2 = new Student();
		student2.setName("Sisi");
		Teacher teacher1 = new Teacher("Mr Ivanov");
		Team team1 = teacher1.createTeam("BEL");
		team1.addStudent(student1);
		team1.addStudent(student2);
		team1.createAppointment(LocalDate.now());
		System.out.println(team1.writeNewPost("Zdraveite deteta!"));
		System.out.println(student1.getName());
	}

}
