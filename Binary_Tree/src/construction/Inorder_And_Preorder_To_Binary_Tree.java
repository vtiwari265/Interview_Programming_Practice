package construction;
import util.Node;

public class Inorder_And_Preorder_To_Binary_Tree {
	static int preIndex = 0;
	public static Node construct(int[] inorder, int[] preorder) {
		return constructTree(0, inorder.length - 1, inorder, preorder);
	}
	
	public static Node constructTree(int start, int end, int[] inorder, int[] preorder) {
		if (start > end) return null;
		Node root = new Node(preorder[preIndex++]);
		if (start == end) return root;
		int inIndex = find(inorder, preorder[preIndex]);
		
		root.left = constructTree(start, inIndex - 1, inorder, preorder);
		root.right = constructTree(inIndex + 1, end, inorder, preorder);
		return root;
	}
	
	public static int find(int[] inorder, int index) {
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == index) return i;
		}
		return -1;
	}
}