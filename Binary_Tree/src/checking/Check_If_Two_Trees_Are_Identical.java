package checking;

import util.Node;

public class Check_If_Two_Trees_Are_Identical {
	static boolean found;
	public static boolean check(Node root1, Node root2) {
		found = true;
		checkTree(root1, root2);
		return found;
	}
	
	public static void checkTree(Node root1, Node root2) {
		if ((root1 == null) && (root2 != null)) {
			found = false;
			return;
		}
		if ((root1 != null) && (root2 == null)) {
			found = false;
			return;
		}
		if ((root1 == null) && (root2 == null)) {
			return;
		}
		checkTree(root1.left, root2.left);
		checkTree(root1.right, root2.right);
		if (root1.value != root2.value) found = false;
	}
}