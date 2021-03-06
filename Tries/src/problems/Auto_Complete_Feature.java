package problems;

import java.util.ArrayList;

import util.TrieNode;

class AutoComplete {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class Auto_Complete_Feature {	
	public static ArrayList<String> autoComplete(TrieNode root, String query) {
		TrieNode node = search(root, query);
		if (node == null) return AutoComplete.arr;
		find(node, "");
		for (int i = 0; i < AutoComplete.arr.size(); i++) AutoComplete.arr.set(i, query + AutoComplete.arr.get(i));
		return AutoComplete.arr;
	}
	
	private static TrieNode search(TrieNode node, String query) {
		for (int i = 0; i < query.length(); i++) {
			if (node.map.get(query.charAt(i)) == null) return null;
			node = node.map.get(query.charAt(i));
		}
		return node;
	}
	
	private static void find(TrieNode node, String string) {
		if (node.endOfWord) AutoComplete.arr.add(string);
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) find(node.map.get((char)i), string + (char)i);
		}
	}
}
