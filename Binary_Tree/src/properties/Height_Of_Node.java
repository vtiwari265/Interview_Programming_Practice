package properties;

import java.util.ArrayList;

import util.Node;

public class Height_Of_Node {
	static ArrayList<Integer> arr;
	public static int find(Node root, Node find) {
		arr = new ArrayList<Integer>();
		findPath(root, find);
		return arr.size();
	}
	
	public static boolean findPath(Node root, Node find) {
		if (root == null) return false;
		boolean left = findPath(root.left, find);
		boolean right = findPath(root.right, find);
		if (root.value == find.value) {
			arr.add(root.value);
			return true;
		}
		if (left || right) {
			arr.add(root.value);
			return true;
		}
		else return false;
	}
}
