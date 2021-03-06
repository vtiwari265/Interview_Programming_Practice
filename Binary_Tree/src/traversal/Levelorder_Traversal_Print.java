package traversal;
import java.util.LinkedList;
import java.util.Queue;

import util.Node;

public class Levelorder_Traversal_Print {
	public static void levelorder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.value);
			if (node.left != null)
				queue.add(node.left);
			if (node.right != null)
				queue.add(node.right);
		}
	}
}
