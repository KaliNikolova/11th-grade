package problem1;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		vowelConsonant(new File("src/problem1/Problem1.java"));
	}

	public static void vowelConsonant(File file) throws Exception {
		if (!file.exists()) {
			System.out.println("This file does not exist");
			return;
		}
		Set<Character> setVowels = new HashSet<Character>(Arrays.asList(new Character[] { 'a', 'e', 'i', 'o', 'u' }));
		Scanner sc = new Scanner(file);
		String str;
		int vowel = 0;
		int consonant = 0;
		while (sc.hasNext()) {
			str = sc.next();
			str.toLowerCase();
			for (char ch : str.toCharArray()) {
				if (ch >= 'a' && ch <= 'z') {
					if(setVowels.contains(ch)) vowel++;
					else consonant++;
				}
			}
		}
		System.out.println("Vowels:\t\t"+vowel+"\nConsonants:\t"+consonant);
	}
}
