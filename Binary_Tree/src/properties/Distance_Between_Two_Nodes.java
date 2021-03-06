package properties;

import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Distance_Between_Two_Nodes {
	static ArrayList<Node> arr1;
	static ArrayList<Node> arr2;	
	public static int find(Node root, Node first, Node second) {
		arr1 = new ArrayList<Node>();
		arr2 = new ArrayList<Node>();
		findPath1(root, first);
		findPath2(root, second);
		Collections.reverse(arr1);
		Collections.reverse(arr2);
		int size = Math.max(arr1.size(), arr2.size());
		int i;
		for (i = 0; i < size; i++) {
			if (arr1.get(i).value != arr2.get(i).value) break;
		}
		return ((arr1.size() - i) + (arr2.size() - i));
	}
	
	public static boolean findPath1(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath1(root.left, find);
		boolean right = findPath1(root.right, find);
		if (root.value == find.value) {
			arr1.add(root);
			return true;
		}
		if (left || right) {
			arr1.add(root);
			return true;
		}
		else return false;
	}
	
	public static boolean findPath2(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath2(root.left, find);
		boolean right = findPath2(root.right, find);
		if (root.value == find.value) {
			arr2.add(root);
			return true;
		}
		if (left || right) {
			arr2.add(root);
			return true;
		}
		else return false;
	}
}
/*
 * Find distance between two nodes of a Binary Tree
Find the distance between two keys in a binary tree, no parent pointers are given. Distance between two nodes is the minimum number of edges to be traversed to reach one node from other.
*/
