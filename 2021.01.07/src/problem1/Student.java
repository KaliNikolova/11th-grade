package problem1;

public class Student extends Person {

	ClassStatus classStatus;
	
	public Student(String name, String address, String phoneNumber, String email, ClassStatus classStatus) {
		super(name, address, phoneNumber, email);
		this.classStatus = classStatus;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Class status:\t"+classStatus+"\n";
	}
}
