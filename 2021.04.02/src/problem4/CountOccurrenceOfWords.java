package problem4;

import java.util.*;

public class CountOccurrenceOfWords {
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " + "Have a good visit. Have fun!";
		
		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String[] words = text.split("[\\s+\\p{P}]");  // The text is split into words using a whitespace \s or punctuation \p{P} as a delimiter
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		// Get all entries into a set
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
		for(int i =0;i<list.size();i++) {
			for(int j = i+1;j<list.size();j++) {
				if(list.get(i).getValue()>list.get(j).getValue()) {
					Collections.swap(list, i, j);
				}
			}
		}
		// Get key and value from each entry
		for (Map.Entry<String, Integer> entry : list)
			System.out.println(entry.getKey() + "\t" + entry.getValue());

	}
}
