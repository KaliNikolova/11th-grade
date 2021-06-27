package vehicles;

public class Vehicle {

	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	private String chassisNo;
	private String model;
	
	public Vehicle(String model) {
		numVehicles++;
		chassisNo = "ch"+numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}

	public String toString() {
		String r="";
		r = "The vehicle is manufactured by: " + Vehicle.MAKE;
		r+="\nThe model type is "+model;
		r+="\nThe chassis number is "+chassisNo;
		return r;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public static void numVehicles() {
		System.out.println("Number of vehicles manufactured: "+Vehicle.numVehicles);
	}
	public static String getMAKE() {
		return MAKE;
	}

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}
}
