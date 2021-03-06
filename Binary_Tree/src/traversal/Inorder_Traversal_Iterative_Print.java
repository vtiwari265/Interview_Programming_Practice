package traversal;
import java.util.Stack;

import util.Node;

public class Inorder_Traversal_Iterative_Print {
	public static void inorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		
		Node node = root;
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
		while (!stack.isEmpty()) {
			node = stack.pop();
			System.out.println(node.value);
			if (node.right != null) {
                node = node.right;
                stack.push(node);
				while(node.left != null) {
					stack.push(node.left);
					node = node.left;
				}
			}
		}
	}
}