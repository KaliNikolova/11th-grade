import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String name;
		int extraLuggage;
		Seat seat = null;
		int classType;
		boolean b=false;
		while(Airline.getPassengers().size()<=10) {
			seat = null;
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Extra luggage: ");
			extraLuggage = sc.nextInt();
			System.out.print("Class: ");
			classType = sc.nextInt();
			if(classType==1) {
				seat = setPassengerFirst();
			}else {
				seat = setPassengerEconomy();
			}
			
			if(seat!=null) {
			Passenger passenger = new Passenger(name, extraLuggage, seat);
			passenger.printBoardingPass();
			}
			else {
				break;
			}
		}
	}
	public static Seat setPassengerFirst() {
		Seat seat = null;
		for(int i=0;i<5;i++) {
			if(!Airline.seats[i].isTaken()) {
				seat = Airline.seats[i];
				seat.takeTheSeat();
				return seat;
			}
		}
		
			System.out.print("There are no empty seats in first class.\nDo you want a seat in economy class?\nType yes if you want: ");
			if(sc.next().equals("yes")) {
				if(!Airline.seats[9].isTaken()) seat = setPassengerEconomy();
				else {
					System.out.println("No empty seats");
					return null;
				}
			}
			else {
				System.out.println("Next flight leaves in 3 hours.");
				return null;
			}
			return seat;
	}
	public static Seat setPassengerEconomy() {
		Seat seat = null;
		for(int i=5;i<10;i++) {
			if(!Airline.seats[i].isTaken()) {
				seat = Airline.seats[i];
				seat.takeTheSeat();
				return seat;
			}
		}
		
			System.out.print("There are no empty seats in economy class.\nDo you want a seat in first class?\nType yes if you want: ");
			if(sc.next().equals("yes")) {
				if(!Airline.seats[4].isTaken()) {
					seat = setPassengerFirst();
				}
				else {
					System.out.println("No empty seats");
					return null;
				}
				
			}
			else {
				System.out.println("Next flight leaves in 3 hours.");
				return null;
			}
			return seat;
	}
}
