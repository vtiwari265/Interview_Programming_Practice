package checking;

import util.Node;

public class Check_If_All_Leaves_Are_At_Same_Level {
	static boolean found;
	public static boolean checkTree(Node root) {
		found = true;
		check(root);
		return found;
	}
	
	public static int check(Node root) {
		if (root == null) return -1;
		if ((root.left == null) && (root.right == null)) return 0;
		int left = check(root.left);
		int right = check(root.right);
		if (right == -1) return left + 1;
		if (left == -1) return right + 1;
		if (left != right) found = false;
		return left + 1;
	}
}

/*
 * Check if all leaves are at same level
Given a Binary Tree, check if all leaves are at same level or not.

          12
        /    \
      5       7       
    /          \ 
   3            1
  Leaves are at same level

          12
        /    \
      5       7       
    /          
   3          
   Leaves are Not at same level


          12
        /    
      5             
    /   \        
   3     9
  /      /
 1      2
 Leaves are at same level
 */