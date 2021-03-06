package checking;

import util.Node;

public class Check_If_Binary_Tree_Is_Full {
	static boolean found;
	public static boolean check(Node root) {
		found = true;
		checkTree(root);
		return found;
	}
	
	public static void checkTree(Node root) {
		if (root == null) return;
		checkTree(root.left);
		checkTree(root.right);
		if ((root.left == null) && (root.right != null)) found = false;
		if ((root.left != null) && (root.right == null)) found = false;
	}
}

/*
 * Check whether a binary tree is a full binary tree or not
A full binary tree is defined as a binary tree in which all nodes have either zero or two child nodes. 
Conversely, there is no node in a full binary tree, which has one child node. More information about full binary trees can be found here.
 */

