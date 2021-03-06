package checking;

import util.Node;

public class Check_If_Binary_Tree_Is_Perfect {
	static boolean found;
	public static boolean check(Node root) {
		found = true;
		checkTree(root);
		return found;
	}
	
	public static int checkTree(Node root) {
		if (root == null) return -1;
		int left = checkTree(root.left);
		int right = checkTree(root.right);
		if (left != right) found = false;
		return Math.max(left , right) + 1;
	}
}

/*
 * Check whether a given binary tree is perfect or not
Given a Binary Tree, write a function to check whether the given Binary Tree is a prefect Binary Tree or not.

A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.

Examples:
The following tree is a perfect binary tree



               10
           /       \  
         20         30  
        /  \        /  \
      40    50    60   70


               18
           /       \  
         15         30  
The following tree is not a perfect binary tree

      1
    /    \
   2       3
    \     /  \   
     4   5    6
*/
