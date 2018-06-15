package strings;

import java.util.ArrayList;
import java.util.HashMap;

class Trie {
	public HashMap<Character, Trie> map;
	public boolean endOfWord;
	public Trie() {
		map = new HashMap<Character, Trie>();
		endOfWord = false;
	}
}

class Substrings {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class All_Subarrays_Of_String {
	public static ArrayList<String> find(String string) {
		Trie node = new Trie();
		for (int i = 0; i < string.length(); i++) insert(node, string.substring(i));
		findAll(node, "");
		return Substrings.arr;
	}
	
	private static void findAll(Trie node, String string) {
		Substrings.arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) findAll(node.map.get((char)i), string + (char)i);
		}
	}
	
	private static void insert(Trie node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new Trie());
			}
			node = node.map.get(value.charAt(i));
		}
		node.endOfWord = true;
	}
}
