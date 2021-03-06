package traversal;
import java.util.LinkedList;
import java.util.Queue;

import util.Node;

public class Levelorder_Traversal_Line_By_Line_Print {
	public static void levelorder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		Queue<Integer> label = new LinkedList<Integer>();
		queue.add(root);
		label.add(1);
		int previous = 1;
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			Integer level = label.poll();
			if (previous != level) {
				System.out.println();
				previous = level;
			}
			System.out.print(node.value + " ");
			if (node.left != null) {
				queue.add(node.left);
				label.add(level + 1);
			}
			if (node.right != null) {
				queue.add(node.right);
				label.add(level + 1);
			}
		}
	}
}
