package conversion;

import util.Node;

public class Binary_Tree_To_Sum_Tree {
	public static int toSumTree(Node node) {
        if (node == null) return 0;
        int old_val = node.value;
        node.value = toSumTree(node.left) + toSumTree(node.right);
        return node.value + old_val;
    }
}
