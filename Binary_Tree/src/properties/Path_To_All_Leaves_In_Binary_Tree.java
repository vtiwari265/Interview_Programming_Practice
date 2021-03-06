package properties;

import util.Node;

public class Path_To_All_Leaves_In_Binary_Tree {
	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.right.left = new Node(4);
		node.right.right = new Node(5);
		
		paths(node);
	}
	
	static Node root;
	public static void paths(Node Root) {
		root = Root;
		printPaths(Root);
	}
	
	public static void printPaths(Node node) {
		if (node != null) {
            printPaths(node.left);
            if (node.left == null && node.right == null) findPath(root, node);
            System.out.println();
            printPaths(node.right);
        }
	}
	
	public static boolean findPath(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath(root.left, find);
		boolean right = findPath(root.right, find);
		if (root.value == find.value) {
			System.out.print(root.value + " ");
			return true;
		}
		if (left || right) {
			System.out.print(root.value + " ");
			return true;
		}
		else return false;
	}
}

/*
 * Given a binary tree, print out all of its root-to-leaf paths one per line.
Asked by Varun Bhatia

Here is the solution.

Algorithm:

initialize: pathlen = 0, path[1000] 
1000 is some max limit for paths, it can change

printPathsRecur traverses nodes of tree in preorder 
printPathsRecur(tree, path[], pathlen)
   1) If node is not NULL then 
         a) push data to path array: 
                path[pathlen] = node->data.
         b) increment pathlen 
                pathlen++
   2) If node is a leaf node then print the path array.
   3) Else
        a) Call printPathsRecur for left subtree
                 printPathsRecur(node->left, path, pathLen)
        b) Call printPathsRecur for right subtree.
                printPathsRecur(node->right, path, pathLen)
 */