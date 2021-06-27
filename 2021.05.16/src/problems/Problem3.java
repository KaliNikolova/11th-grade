package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		File file = new File("src/problems/Salary.txt");
		int numberOfAssociate = 0;
		int numberOfAssistant = 0;
		int numberOfFull = 0;
		int numberOfFaculty = 0;

		double salaryAssociate = 0;
		double salaryAssistant = 0;
		double salaryFull = 0;
		double salaryFaculty = 0;

		try {
			String line;
			String[] s;
			try (Scanner in = new Scanner(file);) {
				while (in.hasNext()) {
					line = in.nextLine();
					s = line.split(" ");
					if (s[2].equals("associate")) {
						numberOfAssociate++;
						salaryAssociate += Double.parseDouble(s[3]);
					} else if (s[2].equals("assistant")) {
						numberOfAssistant++;
						salaryAssistant += Double.parseDouble(s[3]);
					} else if (s[2].equals("full")) {
						numberOfFull++;
						salaryFull += Double.parseDouble(s[3]);
					} else if (s[2].equals("faculty")) {
						numberOfFaculty++;
						salaryFaculty += Double.parseDouble(s[3]);
					}
				}
			}
			System.out.printf("Salary of associate professors:\t\t%.2f\n", salaryAssociate);
			System.out.printf("Salary of assistant professors:\t\t%.2f\n", salaryAssistant);
			System.out.printf("Salary of full professors:\t\t%.2f\n", salaryFull);
			System.out.printf("Salary of faculty:\t\t\t%.2f\n", salaryFaculty);
			System.out.printf("Average salary of associate professors:\t%.2f\n", salaryAssociate / numberOfAssociate);
			System.out.printf("Average salary of assistant professors:\t%.2f\n", salaryAssistant / numberOfAssistant);
			System.out.printf("Average salary of full professors:\t%.2f\n", salaryFull / numberOfFull);
			System.out.printf("Average salary of faculty:\t\t%.2f\n", salaryFaculty / numberOfFaculty);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
