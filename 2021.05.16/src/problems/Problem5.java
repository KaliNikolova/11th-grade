package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%4s%13s%13s%13s%13s%13s%13s%13s%13s%13s%13s\n", "Year", "Rank 1", "Rank 2", "Rank 3",
				"Rank 4", "Rank 5", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
		for (int i = 2010; i > 2000; i--) {
			System.out.printf("%4d", i);
			File file = new File("src/problems/babynamesranking" + i + ".txt");
			String line = "";
			try {
				try (Scanner sc = new Scanner(file);) {
					for (int j = 0; j < 5; j++) {
						sc.next();
						sc.next();
						sc.next();
						System.out.printf("%13s", sc.next());
						sc.nextLine();
					}
				}

				try (Scanner sc = new Scanner(file);) {
					for (int j = 0; j < 5; j++) {
						sc.next();
						System.out.printf("%13s", sc.next());
						sc.nextLine();
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();

		}
	}

}
