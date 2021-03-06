package calculate;

import util.Node;

public class Shortest_Distance_Between_Two_Nodes_In_Binary_Search_Tree {
	public static int calculate(Node root, int node1, int node2) {
		Node ancestor = LCA(root, node1, node2);
		return (height(root, node1) - height(root, ancestor.value)) + 
				(height(root, node2) - height(root, ancestor.value));
	}
	
	public static int height(Node root, int value) {
		if (root == null) return -10;
		int left = -10, right = -10;
		if (root.value == value) return 0;
		else if (root.value < value) right = height(root.right, value);
		else if (root.value > value) left = height(root.left, value);
		if (right >= 0) return right + 1;
		if (left >= 0) return left + 1;
		return -10;
	}
	
	public static Node LCA(Node node, int node1, int node2) {
		if (node == null) return null;
		if (node.value < node1) return LCA(node.right, node1, node2);
		else if (node.value > node2) return LCA(node.left, node1, node2);
		else if ((node.value >= node1) && (node.value <= node2)) return node;
		return null;
	}
}
