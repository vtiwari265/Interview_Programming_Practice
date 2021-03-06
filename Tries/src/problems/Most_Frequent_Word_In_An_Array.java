package problems;

import java.util.HashMap;

public class Most_Frequent_Word_In_An_Array {
	public static String find(String[] arr) {
		Most most = new Most();
		TrieNodeSpl root = new TrieNodeSpl();
		for (int i = 0; i < arr.length; i++) insert(root, arr[i]);
		findWords(root, most, "");
		return most.string;
	}
	
	public static void findWords(TrieNodeSpl root, Most most, String string) {
		System.out.println(root.words + " " + string + " " + most.count);
		if (root.words > most.count) {
			most.count = root.words;
			most.string = string;
		}
		for (int i = 'A'; i <= 'z'; i++) {
			if (root.map.get((char)i) != null) findWords(root.map.get((char)i), most, string + (char)i);
		}
	}
	
	private static void insert(TrieNodeSpl node, String value) {
		for (int i = 0; i < value.length(); i++) {
			if (node.map.get(value.charAt(i)) == null) {
				node.map.put(value.charAt(i), new TrieNodeSpl());
			}
			node = node.map.get(value.charAt(i));
		}
		node.words++;
	}
}

class Most {
	int count;
	String string;
	public Most() {
		count = 0;
		string = "";
	}
}

class TrieNodeSpl {
	HashMap<Character, TrieNodeSpl> map;
	int words;
	TrieNodeSpl() {
		map = new HashMap<Character, TrieNodeSpl>();
		words = 0;
	}
}