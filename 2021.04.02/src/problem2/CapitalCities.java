package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CapitalCities {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File fileCountries = new File("src/problem2/countries");
		File fileCapitals = new File("src/problem2/capitals");
		if (!fileCountries.exists() || !fileCountries.exists())
			return;
		Scanner scCapitals = new Scanner(fileCapitals);
		Scanner scCountries = new Scanner(fileCountries);

		Map<String, String> map = new HashMap<String, String>();

		while (scCapitals.hasNextLine() && scCountries.hasNextLine()) {
			map.put(scCountries.nextLine(), scCapitals.nextLine());
		}
		scCapitals.close();
		scCountries.close();
		int rand;
		int score = 10;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the capital city of the country!");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (score >= 30) {
				System.out.println("Congratulations! You won!");
				break;
			}
			if (score <= 0) {
				System.out.println("Game over");
				break;
			}
			rand = (int) (Math.random() * map.size());
			String country = entry.getKey();
			System.out.print(country + ": ");
			String guess = sc.nextLine();
			guess.toLowerCase();
			if (guess.equals(entry.getValue().toLowerCase())) {
				score += 2;
				System.out.println("Right answer!  +2 POINTS\nYour score is " + score);
			} else {
				score--;
				System.out.println("Wrong answer! The capital of " + country + " is " + entry.getValue()
						+ ". -1 POINT\nYour score is " + score);
			}
		}
	}

}
