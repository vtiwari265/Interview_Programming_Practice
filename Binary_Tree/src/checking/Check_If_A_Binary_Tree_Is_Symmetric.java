package checking;

import util.Node;

// This method checks the if the tree is a mirror of itself

public class Check_If_A_Binary_Tree_Is_Symmetric {
	static boolean found;
	public static boolean check(Node root) {
		found = true;
		checkTrees(root, root);
		return found;
	}
	
	public static void checkTrees(Node root1, Node root2) {
		if ((root1 == null) && (root2 != null)) {
			found = false;
			return;
		}
		if ((root1 != null) && (root2 == null)) {
			found = false;
			return;
		}
		if ((root1 == null) && (root2 == null)) return;
		if (root1.value != root2.value) {
			found = false;
			return;
		}
		checkTrees(root1.left, root2.right);
		checkTrees(root1.right, root2.left);
	}
}
/*Check for Symmetric Binary Tree (Iterative Approach)
Given a binary tree, check whether it is a mirror of itself without recursion.

Examples:

Input :   
    
     1
   /   \
  2     2
 / \   / \
3   4 4   3

Output : Symmetric

Input :    
   
    1
   / \
  2   2
   \   \
   3    3

Output : Not Symmetric
 */