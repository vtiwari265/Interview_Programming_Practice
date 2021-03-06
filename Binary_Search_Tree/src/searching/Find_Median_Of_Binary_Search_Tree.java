package searching;

import util.Node;

class info {
	static int size;
	static int first;
	static int second;
	static int mid;
}

public class Find_Median_Of_Binary_Search_Tree {	
	public static int find(Node root) {
		info.size = 0;
		info.first = 0;
		info.second = 0;
		findSize(root);
		info.mid = info.size/2;
		info.mid++;
		if ((info.size%2) == 0) {
			findMedianEven(root);
			return (info.first + info.second)/2;
		}
		if ((info.size%2) == 1) {
			findMedianOdd(root);
			return info.first;
		}
		return -1;
	}
	
	public static void findSize(Node node) {
		if (node == null) return;
		findSize(node.left);
		info.size++;
		findSize(node.right);
	}
	
	public static void findMedianEven(Node node) {
		if (node == null) return;
		findMedianEven(node.left);
		info.mid--;
		if (info.mid == 1) info.first = node.value;
		if (info.mid == 0) {
			info.second = node.value;
			return;
		}
		findMedianEven(node.right);
	}
	
	public static void findMedianOdd(Node node) {
		if (node == null) return;
		findMedianOdd(node.left);
		info.mid--;
		if (info.mid == 0) {
			info.first = node.value;
			return;
		}
		findMedianOdd(node.right);
	}
}
