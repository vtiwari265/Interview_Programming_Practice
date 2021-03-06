package properties;
import util.Node;

public class Find_Inorder_Successor {
	static Node next;
	static boolean found;
	
	public static Node find(Node root, Node value) {
		next = null;
		found = false;
		traverse(root, value);
		return next;
	}
	
	public static void traverse(Node root, Node value) {
		if (root == null) return;
		traverse(root.left, value);
		if (found) {
			found = false;
			next = root;
		}
		if (root.value == value.value) found = true;
		traverse(root.right, value);
	}
}
