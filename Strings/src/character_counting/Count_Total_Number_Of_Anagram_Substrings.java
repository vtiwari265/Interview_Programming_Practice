package character_counting;

import java.util.ArrayList;
import java.util.Arrays;
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

public class Count_Total_Number_Of_Anagram_Substrings {	
	public static ArrayList<ArrayList<String>> findAll(String string) {
		ArrayList<String> arr = find(string);
		String[] arr1 = new String[arr.size()];
		arr.toArray(arr1);
		return find2(arr1);
	}
	
	private static ArrayList<String> find(String string) {
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
	
	private static ArrayList<ArrayList<String>> find2(String[] words) {
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
