package problem2;

import java.util.*;
import java.io.*;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		File file = new File( "src/problem2/CountKeywords.java" );
		if (file.exists()) {
			System.out.println( " The number of keywords is " + countKeywords(file));
		} else {
			System.out.println( " File does not exist " );
		}
/* else for do */
	}

	public static int countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = { " abstract " , "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", " goto " , "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
		int count = 0;

		Scanner input = new Scanner(file);
		int i = 0;
		boolean comment = false ;
		while (input.hasNext()) {
			String word = input.next();
			if (word.equals("//"))
				input.nextLine();
			else if (word.equals("\""))
				i++;
			else if (word.equals("/*"))
				comment = true ;
			else if (word.equals("*/"))
				comment = false ;
			else if (i % 2 == 0 && comment == false ) {
				if (keywordSet.contains(word))
					count++;
			}

		}
		input.close();
		return count;

	}
}