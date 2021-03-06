package properties;
import util.Node;

public class Depth_Of_Tree {	
	public static int depth(Node node) {
		if (node == null) return -1;
		int left = depth(node.left);
		int right = depth(node.right);
		return Math.max(left + 1, right + 1);
	}
}
