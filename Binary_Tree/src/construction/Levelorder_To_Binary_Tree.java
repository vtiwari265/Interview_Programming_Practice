package construction;

/* This will form a complete tree like following
Input  :  arr[] = {1, 2, 3, 4, 5, 6}
Output : Root of the following tree
                  1
                 / \
                2   3
               / \ /
              4  5 6


Input: arr[] = {1, 2, 3, 4, 5, 6, 6, 6, 6, 6}
Output: Root of the following tree
                   1
                  / \
                 2   3
                / \ / \
               4  5 6  6
              / \ /
             6  6 6
*/

import java.util.LinkedList;
import java.util.Queue;

import util.Node;

public class Levelorder_To_Binary_Tree {
	public static Node construct(int[] arr) {
		Node root = new Node(arr[0]);
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int index = 0;
		while(index < arr.length) {
			Node node = queue.poll();
			index++;
			if (index >= arr.length) break;
			node.left = new Node(arr[index]);
			queue.add(node.left);
			index++;
			if (index >= arr.length) break;
			node.right = new Node(arr[index]);
			queue.add(node.right);
		}
		return root;
	}
}
