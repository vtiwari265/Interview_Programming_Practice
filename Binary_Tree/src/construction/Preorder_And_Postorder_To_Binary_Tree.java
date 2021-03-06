package construction;

import util.Node;

public class Preorder_And_Postorder_To_Binary_Tree {

	static int preIndex;
	static Node constructTree(int pre[], int post[]) {
		preIndex = 0;
		return constructTreeUtil(pre, post, 0, pre.length - 1, pre.length);
	}
	
	static Node constructTreeUtil(int pre[], int post[], int l, int h, int size) {
		if (preIndex >= size || l > h) return null;
		Node root = new Node(pre[preIndex++]);
		if (l == h || preIndex >= size) return root;
		int i;
		for (i = l; i <= h; i++) {
			if (post[i] == pre[preIndex]) break;
		}
		if (i <= h) {
			root.left = constructTreeUtil(pre, post, l, i, size);
			root.right = constructTreeUtil(pre, post, i + 1, h, size);
		}
		return root;
	}		
}
