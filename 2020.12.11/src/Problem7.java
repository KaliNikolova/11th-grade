import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {

	enum Alphabet {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurencesOfEachDifferentWord();
		numberOfEachLength();
		numberOfEachLetter();
	}

	public static void numberOfEachLetter() {
		int occurence[] = new int[26];
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				occurence[s.charAt(i) - 'a']++;
			}
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				occurence[s.charAt(i) - 'A']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			if (occurence[i] != 0) {
				System.out.println(occurence[i] + " " + (char) ('a' + i));
			}
		}
	}

	public static void numberOfEachLength() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String splited[] = s.split("\\s+");
		int lengths[] = new int[splited.length];
		for (int i = 0; i < splited.length; i++) {
			lengths[i] = splited[i].length();
		}
		System.out.println("Length\tOccurences");
		int br;
		for (int i = 1; i < s.length(); i++) {
			br = 0;
			for (int j = 0; j < splited.length; j++) {
				if (i == lengths[j])
					br++;
			}
			if (br != 0)
				System.out.println(i + "\t" + br);
		}
	}

	public static void occurencesOfEachDifferentWord() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Word\tOccurences");
		String splited[] = s.split("\\s+");
		int br = 0;
		for (int i = 0; i < splited.length; i++) {
			br = 1;
			if (i == splited.length) {

			}
			if (splited[i] != null && i != splited.length) {
				for (int j = i + 1; j < splited.length; j++) {
					if(splited[j]!=null){
						if (splited[i].equals(splited[j])) {
							br++;
							splited[j] = null;
						}
					}
				}
				System.out.println(splited[i] + "\t" + br);
			}
		}
	}
}
