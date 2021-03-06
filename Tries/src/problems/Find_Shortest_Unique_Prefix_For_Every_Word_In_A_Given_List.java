package problems;

import java.util.ArrayList;
import java.util.HashMap;

class TrieNodeAAA {
	public HashMap<Character, TrieNodeAAA> map;
	int count;
	public boolean endOfWord;
	public TrieNodeAAA() {
		map = new HashMap<Character, TrieNodeAAA>();
		count = 0;
		endOfWord = false;
	}
}

class CountAll {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class Find_Shortest_Unique_Prefix_For_Every_Word_In_A_Given_List {	
	public static ArrayList<String> find(String[] arr) {
		TrieNodeAAA node = new TrieNodeAAA();
		for (int i = 0; i < arr.length; i++) insert(node, arr[i]);
		for (int i = 0; i < arr.length; i++) findAA(node, arr[i]);
		return CountAll.arr;
	}
	
	private static void insert(TrieNodeAAA node, String value) {
		for (int i = 0; i < value.length(); i++) {
			node.count++;
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieNodeAAA());
			}
			node = node.map.get(value.charAt(i));
		}
		node.endOfWord = true;
	}
	
	private static void findAA(TrieNodeAAA node, String string) {
		String temp = "";
		for (int i = 0; i < string.length(); i++) {
			node = node.map.get(string.charAt(i));
			temp += string.charAt(i);
			if (node.count == 1) {
				CountAll.arr.add(temp);
				return;
			}
			if (node.endOfWord) {
				CountAll.arr.add(temp);
				return;
			}
		}
	}
}
