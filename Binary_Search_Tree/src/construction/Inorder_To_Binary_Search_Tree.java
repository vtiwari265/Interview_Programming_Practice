package construction;

import util.Node;

public class Inorder_To_Binary_Search_Tree {
	public static Node construct(int[] arr) {
		return (constructTree(arr, 0, arr.length - 1));
	}
	
	public static Node constructTree(int[] arr, int lo, int hi) {
		if (hi < lo) return null;
		int mid = (hi + lo)/2;
		Node node = new Node(arr[mid]);
		node.left = constructTree(arr, lo, mid - 1);
		node.right = constructTree(arr, mid + 1, hi);
		return node;
	}
}
