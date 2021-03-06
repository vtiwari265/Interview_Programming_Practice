package problems;

import java.util.HashMap;

class TrieNodeAA {
	HashMap<Character, TrieNodeAA> map;
	int words;
	public TrieNodeAA() {
		map = new HashMap<Character, TrieNodeAA>();
		words = 0;
	}
}

public class Frequency_Of_A_String_In_An_Array_Of_Strings {	
	public static int[] find(String[] arr, String[] queries) {
		TrieNodeAA node = new TrieNodeAA();
		int[] ans = new int[queries.length];
		for (int i = 0; i < arr.length; i++) insert(node, arr[i]);
		for (int i = 0; i < queries.length; i++) ans[i] = search(node, queries[i]);
		return ans;
	}
	
	private static void insert(TrieNodeAA node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieNodeAA());
			}
			node = node.map.get(value.charAt(i));
		}
		node.words++;
	}
	
	private static int search(TrieNodeAA node, String query) {
		for (int i = 0; i < query.length(); i++) {
			if (node.map.get(query.charAt(i)) == null) return 0;
			node = node.map.get(query.charAt(i));
		}
		return node.words;
	}
}
