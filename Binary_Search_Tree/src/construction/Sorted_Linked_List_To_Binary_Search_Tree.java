package construction;

import util.Node;
import util.NodeLL;

public class Sorted_Linked_List_To_Binary_Search_Tree {	
	public static Node construct(NodeLL node) {
		if (node == null) return null;
		if (node.next == null) return new Node(node.value);
		int length = length(node);
		NodeLL mid = findMid(node, length);
		
		Node root = new Node(mid.value);
		root.left = construct(node);
		root.right = construct(mid.next);
		return root;
	}
	
	private static int length(NodeLL node) {
		int length = 0;
		while (node != null) {
			length++;
			node = node.next;
		}
		return length;
	}
	
	private static NodeLL findMid(NodeLL node, int length) {
		int mid = length/2;
		while (mid > 1) {
			node = node.next;
			mid--;
		}
		NodeLL right = node.next;
		node.next = null;
		return right;
				
	}
}
