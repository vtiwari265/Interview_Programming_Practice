package character_counting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Group_Words_With_Same_Set_Of_Characters {	
	public static ArrayList<ArrayList<String>> find(String[] words) {
		ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			char[] temp = words[i].toCharArray();
			Arrays.sort(temp);
			String temp1 = String.valueOf(temp);
			if (map.get(temp1) == null) {
				map.put(temp1, index);
				index++;
				ArrayList<String> temp2 = new ArrayList<String>();
				temp2.add(words[i]);
				arr.add(temp2);
			}
			else {
				arr.get(map.get(temp1)).add(words[i]);
			}
		}
		return arr;
	}
}
