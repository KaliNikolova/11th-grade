package problem2;

import java.time.LocalDate;

public class Team {

	private String name;
	private Teacher teacher;
	private Student[] students = new Student[30];
	private int numberOfStudents;
	
	public Team() {
		numberOfStudents=0;
	}
	public Team(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher;
		numberOfStudents=0;
	}
	public Team(String name, Teacher teacher, Student[] students) {
		this.name = name;
		this.teacher = teacher;
		this.students = students;
		numberOfStudents = students.length;
	}
	public void addStudent(Student student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String createAppointment(LocalDate date) {
		return  "Meeting for this date: "+date+" was created";
	}
	public String writeNewPost(String text) {
		return name+"\n"+teacher.getName()+"\n"+text;
	}
}
