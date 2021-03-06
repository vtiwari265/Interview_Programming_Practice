package deletion;

import util.Node;

public class Delete_A_Tree_Completely {
	public static void delete(Node node) {
		if (node == null) return;
		delete(node.left);
		delete(node.right);
		node = null;
	}
}
/*Write a program to Delete a Tree.
To delete a tree we must traverse all the nodes of the tree and delete them one by one. So which traversal we should use – Inorder or Preorder or Postorder. Answer is simple – Postorder, because before deleting the parent node we should delete its children nodes first

We can delete tree with other traversals also with extra space complexity but why should we go for other traversals if we have Postorder available which does the work without storing anything in same time complexity.

For the following tree nodes are deleted in order – 4, 5, 2, 3, 1
 */