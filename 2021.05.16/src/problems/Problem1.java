package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("src/problems/names");
		System.out.println(readInFile("Sofi", file));

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		writeInFile(name, file);
	}

	public static int readInFile(String line, File file) {
		try {
			Scanner sc = new Scanner(file);
			int i = 1;
			while (sc.hasNext()) {
				if (line.equals(sc.nextLine()))
					return i;
				i++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated
			return -1;
		}
		return -1;
	}

	public static int writeInFile(String name, File file) {
		try (PrintWriter output = new PrintWriter(new FileWriter(file, true));) {
			output.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	
}
