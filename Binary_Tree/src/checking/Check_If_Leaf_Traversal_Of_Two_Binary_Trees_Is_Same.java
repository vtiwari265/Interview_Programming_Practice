package checking;

import java.util.ArrayList;

import util.Node;

public class Check_If_Leaf_Traversal_Of_Two_Binary_Trees_Is_Same {
	static ArrayList<Integer> arr1;
	static ArrayList<Integer> arr2;
	public static boolean check(Node root1, Node root2) {
		arr1 = new ArrayList<Integer>();
		arr2 = new ArrayList<Integer>();
		inorder1(root1);
		inorder2(root2);
		return (arr1.equals(arr2));
	}
	
	public static void inorder1(Node root) {
		if (root == null) return;
		inorder1(root.left);
		if ((root.left == null) && (root.right == null)) arr1.add(root.value);
		inorder1(root.right);
	}
	
	public static void inorder2(Node root) {
		if (root == null) return;
		inorder2(root.left);
		if ((root.left == null) && (root.right == null)) arr2.add(root.value);
		inorder2(root.right);
	}
}

/*
 *Check if leaf traversal of two Binary Trees is same?
Leaf traversal is sequence of leaves traversed from left to right. The problem is to check if leaf traversals of two given Binary Trees are same or not.

Expected time complexity O(n). Expected auxiliary space O(h1 + h2) where h1 and h2 are heights of two Binary Trees.

Examples:

Input: Roots of below Binary Trees
         1            
    / \
       2   3      
      /   / \          
     4   6   7

     0
    /  \
       5    8      
        \  / \        
        4  6  7
Output: same
Leaf order traversal of both trees is 4 6 7     

Input: Roots of below Binary Trees
         0            
    / \
       1   2       
      / \       
     8   9   

     1
    / \
       4   3     
        \ / \        
        8 2  9

Output: Not Same
Leaf traversals of two trees are different.
For first, it is 8 9 2 and for second it is
8 2 9 
*/