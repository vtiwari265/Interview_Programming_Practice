package basic;

import util.TrieNode;

public class Delete {
	public static TrieNode delete(TrieNode node, String string) {
		if (string.length() == 0) {
			node.endOfWord = false;
			if (node.map.size() == 0) return null;
			else return node;
		}
		if (node.map.get(string.charAt(0)) == null) return node;
		TrieNode returned = delete(node.map.get(string.charAt(0)), string.substring(1));
		if (returned == null) node.map.remove(string.charAt(0));
		if (node.map.size() == 0) return null;
		else return node;
	}
}
