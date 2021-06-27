package problem2;

public class Test {
	public static void main(String[] args) {
		new Person().printPerson();
		new Student().printPerson();
	}
}
class Student extends Person {
	// @Override
	 private String getInfo() {
		 return "Student";
	 }
	}
class Person {
	 private String getInfo() {
		 return "Person";
	 }
	 public void printPerson() {
		 System.out.println(getInfo());
	 }
}

