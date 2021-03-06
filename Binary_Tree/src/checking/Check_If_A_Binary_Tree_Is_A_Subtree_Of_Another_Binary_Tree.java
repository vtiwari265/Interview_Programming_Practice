package checking;

import util.Node;

public class Check_If_A_Binary_Tree_Is_A_Subtree_Of_Another_Binary_Tree {
	static Node root;
	static boolean found;
	public static boolean check(Node root1, Node root2) {
		root = null;
		found = true;
		find(root1, root2);
		checkCopy(root, root2);
		return found;
	}
	
	public static void find(Node root1, Node root2) {
		if (root1 == null) return;
		if (root1.value == root2.value) root = root1;
		find(root1.left, root2);
		find(root1.right, root2);
	}
	
	public static boolean checkCopy(Node root1, Node root2) {
		found = true;
		checkTree(root1, root2);
		return found;
	}
	
	public static void checkTree(Node root1, Node root2) {
		if ((root1 == null) && (root2 != null)) {
			found = false;
			return;
		}
		if ((root1 != null) && (root2 == null)) {
			found = false;
			return;
		}
		if ((root1 == null) && (root2 == null)) {
			return;
		}
		checkTree(root1.left, root2.left);
		checkTree(root1.right, root2.right);
		if (root1.value != root2.value) found = false;
	}
}
/*Check if a binary tree is subtree of another binary tree | Set 2
Given two binary trees, check if the first tree is subtree of the second one. A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T.

The subtree corresponding to the root node is the entire tree; the subtree corresponding to any other node is called a proper subtree.

For example, in the following case, Tree1 is a subtree of Tree2.


        Tree1
          x 
        /    \
      a       b
       \
        c


        Tree2
              z
            /   \
          x      e
        /    \     \
      a       b      k
       \
        c
*/