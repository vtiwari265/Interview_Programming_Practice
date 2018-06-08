package properties;

import util.Node;

public class Size_Of_Tree {
	static int size;
	public static int size(Node node) {
		size = 0;
		sizeTree(node);
		return size;
	}
	
	public static void sizeTree(Node node) {
		if (node == null) return;
		sizeTree(node.left);
		sizeTree(node.right);
		size++;
	}
}
