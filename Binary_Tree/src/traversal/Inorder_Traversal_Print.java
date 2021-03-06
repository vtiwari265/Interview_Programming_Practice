package traversal;
import util.Node;

public class Inorder_Traversal_Print {
	public static void inorder(Node root) {
		if (root == null) return;
		inorder(root.left);
		System.out.println(root.value);
		inorder(root.right);
	}
}
