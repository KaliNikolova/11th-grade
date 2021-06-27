package problems;

import java.io.File;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year < 2001 || year > 2010) {
			System.out.println("Wrong year");
			return;
		}
		String fileName = "src/problems/babynamesranking" + year + ".txt";
		System.out.print("Enter the gender: ");
		char gender = sc.next().toLowerCase().charAt(0);
		// if(gender == 'm') System.out.println("male");
		System.out.print("Enter the name: ");
		String name = sc.next();
		int ranking = 1;
		try {
			File file = new File(fileName);
			try (Scanner in = new Scanner(file);) {
				String s[];
				while (in.hasNext()) {
					s = in.nextLine().split("\\s");
					if (gender == 'm' && s[2].equals(name)) {
						System.out.println(ranking);
						return;
					}
					if (gender == 'f' && s[5].equals(name)) {
						System.out.println(ranking);
						return;
					}
					ranking++;
				}
				System.out.println("The name " + name + " is not ranked in year " + year);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
