package character_counting;

import java.util.ArrayList;
import java.util.HashSet;

public class Count_Number_Of_Substrings_With_Exactly_K_Distinct_Characters {
	public static int count(String string, int k) {
		HashSet<Character> set = new HashSet<Character>();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < string.length(); i++) {
			set.clear();
			for (int j = i; j < string.length(); j++) {
				set.add(string.charAt(j));
				if (set.size() == k) arr.add(string.substring(i, j + 1));
			}
		}
		System.out.println(arr.toString());
		return arr.size();
	}
}
