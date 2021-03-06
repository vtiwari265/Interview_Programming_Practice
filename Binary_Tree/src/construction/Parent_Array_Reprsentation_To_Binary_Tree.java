package construction;

import java.util.HashMap;

import util.Node;

public class Parent_Array_Reprsentation_To_Binary_Tree {	
	public static Node construct(int[] parent) {
		HashMap<Integer, Node> map = new HashMap<Integer, Node>();
		Node root = null;
		for (int i = 0; i < parent.length; i++) map.put(i, new Node(i));
		for (int i = 0; i < parent.length; i++) {
			if (parent[i] != -1) {
				if (map.get(parent[i]).left == null) map.get(parent[i]).left = map.get(i);
				else map.get(parent[i]).right = map.get(i);
			}
			else root = map.get(i);
		}
		return root;
	}
}
