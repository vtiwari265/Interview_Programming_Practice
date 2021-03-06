package construction;

import util.Node;

public class Inorder_To_Binary_Tree {
	public static Node construct(int[] in) {
		return constructTree(in, 0, in.length - 1);
	}
	
	public static Node constructTree(int[] in, int start, int last) {
		if (last < start) return null;
		int mid = (start + last)/2;
		Node root = new Node(in[mid]);
		root.left = constructTree(in, start, mid - 1);
		root.right = constructTree(in, mid + 1, last);
		return root;
	}
}
