package properties;

import java.util.LinkedList;
import java.util.Queue;

import util.Node;

public class Maximum_Node_Horizontally_Of_Tree_Width {
	public static int width(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		Queue<Integer> label = new LinkedList<Integer>();
		int[] arr = new int[depth(root)];
		
		queue.add(root);
		label.add(0);
		arr[0]++;
		int previous = 1;
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			Integer level = label.poll();
			if (previous != level) {
				previous = level;
			}
			if (node.left != null) {
				queue.add(node.left);
				label.add(level + 1);
				arr[level + 1]++;
			}
			if (node.right != null) {
				queue.add(node.right);
				label.add(level + 1);
				arr[level + 1]++;
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(arr[i], max);
		}
		return max;
	}
	
	public static int depth(Node node) {
		if (node == null) return 0;
		int left = depth(node.left);
		int right = depth(node.right);
		return Math.max(left + 1, right + 1);
	}
}
