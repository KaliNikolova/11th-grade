package problem2;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int points=0;
		for(int i=0;i<5;i++) {
			System.out.println("Do you want a new card(answer \"yes\" or \"no\")?");
			if(sc.next().equals("no")) break;
			int suitNumber = (int)(Math.random()*4.0+1);
			int faceNumber = (int)(Math.random()*13.0+1);
			Card newCard = new Card(suitNumber,faceNumber);
			System.out.println(newCard + ", "+newCard.points+" points");
			points+=newCard.points;
			if(points>21) break;
		}
		sc.close();
	 }
}

