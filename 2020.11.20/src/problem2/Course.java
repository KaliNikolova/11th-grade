package problem2;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void addStudent(String student) {
		students[numberOfStudents] = new String("");
		students[numberOfStudents] = student;
		numberOfStudents++;

	}

	public void dropStudent(String student) {
		boolean b = false;
		for (int i = 0; i < numberOfStudents; i++) {
			if (student.equals(students[i])) {
				b = true;
			}
			if (b)
				students[i] = students[i + 1];
		}
		students[numberOfStudents - 1] = null;
		if (b)
			numberOfStudents--;
		else {
			System.out.println("The name of the student is not valid!");
		}
	}

	public String[] getStudents() {
		String students[] = new String[numberOfStudents];
		for (int i = 0; i < students.length; i++) {
			students[i] = this.students[i];
		}
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
}
