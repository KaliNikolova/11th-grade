package problem3;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Course course = new Course("Mathematics");
		course.addStudent("Kali");
		course.addStudent("Sofi");
		course.addStudent("Persi");
		course.addStudent("George");
		Course copy = (Course) course.clone();
		course.dropStudent("Kali");
		copy.setCourseName("Mathematics - copy");
		copy.addStudent("Maya");
		System.out.println(course.getCourseName() + "\n" + course.getNumberOfStudents() + "\n"
				+ Arrays.toString(course.getStudents()) + "\n");
		System.out.println(
				copy.getCourseName() + "\n" + copy.getNumberOfStudents() + "\n" + Arrays.toString(copy.getStudents()));
	}

}
