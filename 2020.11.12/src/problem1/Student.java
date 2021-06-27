package problem1;

public class Student {
	
	private String name;
	private double uspeh;
	
	public Student() {
		name = "";
		uspeh = 0.0;
	}
	public Student(String name, double uspeh) {
		this.name = name;
		if(uspeh>6||uspeh<0) {
			System.out.println("Nevaliden uspeh");
		}
		else this.uspeh = uspeh;
	}
	
	public String getName() {
		return name;
	}
	public double getUspeh() {
		return uspeh;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUspeh(double uspeh) {
		if(uspeh>6||uspeh<0) {
			System.out.println("Nevaliden uspeh");
		}
		else this.uspeh = uspeh;
	}
	
	public boolean stipendiq() {
		
		if(uspeh>5.50) return true;
		return false;
	}
}
