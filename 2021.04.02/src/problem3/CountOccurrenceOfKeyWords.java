package problem3;

import java.util.*;
import java.io.*;

public class CountOccurrenceOfKeyWords {
	public static void main(String[] args) throws Exception {
		File file = new File("src/problem1/Main.java");
		if (file.exists()) {
			countKeywords(file);
		} else {
			System.out.println("File does not exist");
		}

	}

	public static void countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
		int count = 0;

		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			if (keywordSet.contains(word))
				if (!map.containsKey(word)) {
					map.put(word, 1);
				} else {
					map.put(word, map.get(word) + 1);
				}
		}

		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		input.close();

	}
}