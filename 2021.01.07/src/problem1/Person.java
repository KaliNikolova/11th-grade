package problem1;

public class Person {

	String name;
	String address;
	String phoneNumber;
	String email;
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() {
		return "Name:\t\t"+name+"\nAdress:\t\t"+address+"\nPhone number:\t"+phoneNumber+"\nE-mail:\t\t"+email+"\n";
	}
}
