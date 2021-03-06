package basic;

import util.Node;

public class Insert {
	public static Node insertRecursive(Node root, int value) {
		 if (root == null) return new Node(value);
		 if (root.value < value) root.right = insertRecursive(root.right, value);
		 if (root.value > value) root.left = insertRecursive(root.left, value);
		 return root;
	}
	
	public static Node insertIterative(Node root, int value) {
		Node node = root;
		while (true) {
			if (node.value < value) {
				if (node.right != null) {
					node = node.right;
				}
				else {
					node.right = new Node(value);
					return root;
				}
			}
			else if (node.value > value) {
				if (node.left != null) {
					node = node.left;
				}
				else {
					node.left = new Node(value);
					return root;
				}
			}
		}
	}
}
