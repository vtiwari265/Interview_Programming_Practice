package construction;

import util.Node;

public class Copy_Binary_Tree {
	public static Node copy(Node root) {
		if (root == null) return null;
		Node node = new Node(root.value);
		node.left = copy(root.left);
		node.right = copy(root.right);
		return node;
	}
}
