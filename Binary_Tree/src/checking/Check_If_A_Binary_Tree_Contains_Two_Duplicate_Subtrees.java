package checking;

import java.util.HashMap;

import util.Node;

public class Check_If_A_Binary_Tree_Contains_Two_Duplicate_Subtrees {	
	static HashMap<Integer, Node> map;
	static boolean found;
	public static boolean checkDup(Node root) {
		map = new HashMap<Integer, Node>();
		found = false;
		traverse(root);
		return found;
	}
	
	public static void traverse(Node root) {
		if (root == null) return;
		if (map.get(root.value) != null) {
			System.out.println("Already there: " + root.value);
			if (check(root, map.get(root.value))) found = true;
			return;
		}
		else {
			System.out.println("Was not there: " + root.value);
			map.put(root.value, root);
		}
		traverse(root.left);
		traverse(root.right);
	}
	
	public static boolean check(Node root1, Node root2) {
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

/*Check if a Binary Tree contains duplicate subtrees of size 2 or more
Given a Binary Tree, check whether the Binary tree contains a duplicate sub-tree of size 2 or more.
Note : Two same leaf nodes are not considered as subtree size of a leaf node is one.

Input :  Binary Tree 
               A
             /    \ 
           B        C
         /   \       \    
        D     E       B     
                     /  \    
                    D    E
Output : Yes
*/