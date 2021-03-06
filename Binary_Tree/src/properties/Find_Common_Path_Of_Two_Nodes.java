package properties;

import java.util.ArrayList;
import java.util.Collections;

import util.Node;

public class Find_Common_Path_Of_Two_Nodes {
	static ArrayList<Node> arr1;
	static ArrayList<Node> arr2;	
	public static void find(Node root, Node first, Node second) {
		arr1 = new ArrayList<Node>();
		arr2 = new ArrayList<Node>();
		findPath1(root, first);
		findPath2(root, second);
		Collections.reverse(arr1);
		Collections.reverse(arr2);
		int size = Math.max(arr1.size(), arr2.size());
		int i;
		for (i = 0; i < size; i++) {
			if (arr1.get(i).value != arr2.get(i).value) {
				break;
			}
			else {
				System.out.print(arr1.get(i).value + " ");
			}
		}
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
