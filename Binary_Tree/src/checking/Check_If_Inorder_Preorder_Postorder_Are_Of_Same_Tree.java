package checking;

import java.util.ArrayList;

import util.Node;

public class Check_If_Inorder_Preorder_Postorder_Are_Of_Same_Tree {
	static int preIndex;
	static ArrayList<Integer> arr;
	public static boolean check(int[] in, int[] pre, int[] post) {
		preIndex = 0;
		arr = new ArrayList<Integer>();
		Node root = construct(in, pre);
		post(root);
		for (int i = 0; i < post.length; i++) {
			if (post[i] != arr.get(i)) return false;
		}
		return true;
	}
	
	public static void post(Node root) {
		if (root == null) return;
		post(root.left);
		post(root.right);
		arr.add(root.value);
	}
	
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

/*
 * Check if given Preorder, Inorder and Postorder traversals are of same tree
Given Preorder , Inorder and Postorder traversals of some tree. Write a program to check if they all are of the same tree.

Examples:

Input : Inorder -> 4 2 5 1 3
        Preorder -> 1 2 4 5 3
        Postorder -> 4 5 2 3 1
Output : Yes
Exaplanation : All of the above three traversals are of 
the same tree              1
                         /   \
                        2     3
                      /   \
                     4     5

Input : Inorder -> 4 2 5 1 3
        Preorder -> 1 5 4 2 3
        Postorder -> 4 1 2 3 5
Output : No 
*/