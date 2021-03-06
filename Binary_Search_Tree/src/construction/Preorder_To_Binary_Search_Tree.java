package construction;

import util.Node;

public class Preorder_To_Binary_Search_Tree {
	public static Node constructTree(int[] pre) {
		Node root = new Node(pre[0]);
		for (int i = 1; i < pre.length; i++) {
			insertRecursive(root, pre[i]);
		}
		return root;
	}
	
	public static Node insertRecursive(Node root, int value) {
		 if (root == null) return new Node(value);
		 if (root.value < value) root.right = insertRecursive(root.right, value);
		 if (root.value > value) root.left = insertRecursive(root.left, value);
		 return root;
	}
}
