package problems;

import java.util.ArrayList;
import java.util.HashMap;

class TrieNodeSpecial {
	public HashMap<Character, TrieNodeSpecial> map;
	public int words;
	public TrieNodeSpecial() {
		map = new HashMap<Character, TrieNodeSpecial>();
		words = 0;
	}
}

public class Sort_Strings {	
	static ArrayList<String> arr;
	public static ArrayList<String> sort(String[] strings) {
		arr = new ArrayList<String>();
		TrieNodeSpecial node = new TrieNodeSpecial();
		for (int i = 0; i < strings.length; i++) insert(node, strings[i]);
		sortStrings(node, "");
		return arr;
	}
	
	private static void sortStrings(TrieNodeSpecial node, String string) {
		for (int i = 0; i < node.words; i++) arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) sortStrings(node.map.get((char)i), string + (char)i);
		}
	}
	
	private static void insert(TrieNodeSpecial node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieNodeSpecial());
			}
			node = node.map.get(value.charAt(i));
		}
		node.words++;
	}
}
