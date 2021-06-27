package vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured: "+Vehicle.numVehicles);
		Vehicle vehicle1 = new Vehicle("Vision");
		System.out.println(vehicle1.toString());
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println(vehicle2.toString());
		Vehicle.numVehicles();
		vehicle1.setMAKE("Seer");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		
	}

}
