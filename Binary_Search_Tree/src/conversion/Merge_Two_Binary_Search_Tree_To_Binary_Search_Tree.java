package conversion;

import java.util.ArrayList;

import util.Node;

public class Merge_Two_Binary_Search_Tree_To_Binary_Search_Tree {	
	static ArrayList<Integer> arr1;
	static ArrayList<Integer> arr2;
	public static Node merge(Node root1, Node root2) {
		arr1 = new ArrayList<Integer>();
		arr2 = new ArrayList<Integer>();
		inorder(root1, arr1);
		inorder(root2, arr2);
		int[] arr = MergeSort(arr1, arr2);
		return inorder(arr);
	}
	
	private static void inorder(Node root, ArrayList<Integer> arr) {
		if (root == null) return;
		inorder(root.left, arr);
		arr.add(root.value);
		inorder(root.right, arr);
	}
	
	private static int[] MergeSort(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
		int index1 = 0, index2 = 0, index3 = 0;
		int[] arr = new int[arr1.size() + arr2.size()];
		while (index3 < arr.length) {
			if (index1 == arr1.size()) {
				arr[index3] = arr2.get(index2);
				index2++;
			}
			else if (index2 == arr2.size()) {
				arr[index3] = arr1.get(index1);
				index1++;
			}
			else {
				if (arr1.get(index1) < arr2.get(index2)) {
					arr[index3] = arr1.get(index1);
					index1++;
				}
				else {
					arr[index3] = arr2.get(index2);
					index2++;
				}
			}
			index3++;
		}
		return arr;
	}
	
	private static Node inorder(int[] arr) {
		return (constructTree(arr, 0, arr.length - 1));
	}
	
	private static Node constructTree(int[] arr, int lo, int hi) {
		if (hi < lo) return null;
		int mid = (hi + lo)/2;
		Node node = new Node(arr[mid]);
		node.left = constructTree(arr, lo, mid - 1);
		node.right = constructTree(arr, mid + 1, hi);
		return node;
	}

	
	

}
