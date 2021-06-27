import java.util.ArrayList;

public class Airline {

	public static final double REGULAR_ECONOMY_PRICE = 100;
	public static final double REGULAR_FIRST_PRICE = 200;
	static ArrayList<Passenger> passengers = new ArrayList<Passenger>();
	static Seat[] seats = new Seat[10];
	static {
		for (int i = 0; i < 10; i++) {
			seats[i] = new Seat(i + 1);
		}
	}

	public static ArrayList<Passenger> getPassengers() {
		return passengers;
	}
}
