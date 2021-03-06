package rotation;

import util.Node;

public class Right_Rotation {
	public static Node right(Node root) {
		Node left = root.left;
		Node leftRight = root.left.right;
		
		left.right = root;
		root.left = leftRight;
		
		return left;
	}
}
