package conversion;

import util.Node;

public class Mirror_Binary_Tree {
	public static Node mirror(Node root) {
		if (root == null) return null;
		Node node = new Node(root.value);
		node.right = mirror(root.left);
		node.left = mirror(root.right);
		return node;
	}
}
