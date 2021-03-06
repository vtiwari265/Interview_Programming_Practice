package problems;

import java.util.HashMap;

class TrieNodeA {
	HashMap<Character, TrieNodeA> map;
	int words;
	public TrieNodeA() {
		map = new HashMap<Character, TrieNodeA>();
		words = 0;
	}
}

class Count {
	static int count = 0;
}

public class Count_Number_Of_Words_In_Trie {	
	public static int count(TrieNodeA node) {
		countWords(node);
		return Count.count;
	}
	
	private static void countWords(TrieNodeA node) {
		Count.count += node.words;
		for (int i = 'A'; i <= 'z'; i++) {
			if (node.map.get((char)i) != null) countWords(node.map.get((char)i));
		}
	}
}
