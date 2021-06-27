
public class Passenger {

	String name;
	int extraLuggage;
	Seat seat;
	String boardingPass = "\nBoarding pass:\nName:\t%22s\nPrice of the ticket:\t%.2f\nSeat:\t%22s\nClass:\t%22s\n\n";
	
	public Passenger (String name, int extraLuggage, Seat seat) {
		this.name = name;
		this.extraLuggage = extraLuggage;
		this.seat = seat;
		Airline.getPassengers().add(this);
	}
	
	public double calculatePrice() {
		if(seat.classType == ClassTypeE.ECONOMY) {
			return (5*extraLuggage+Airline.REGULAR_ECONOMY_PRICE);
		}else {
			return (5*extraLuggage+Airline.REGULAR_FIRST_PRICE);
		}
	}
	public void printBoardingPass() {
		System.out.format(boardingPass, name, calculatePrice(), seat.getId(), seat.getClassType().toString());
	}
}
