package construction;
import util.Node;

public class Inorder_And_Levelorder_To_Binary_Tree {
	public static Node buildTree(int in[], int level[]) {
        return constructTree(level, in, 0, in.length - 1);
    }
  
    static Node constructTree(int[] levelOrder, int[] inOrder, int inStart, int inEnd) {
        if (inStart > inEnd)return null;
  
        if (inStart == inEnd)return new Node(inOrder[inStart]);
        
        Node node = null;
             
        boolean found = false;
        int index = 0;
        for (int i = 0; i < levelOrder.length - 1; i++)  {
            int data = levelOrder[i];
            for (int j = inStart; j < inEnd; j++) {
                if (data == inOrder[j]) {
                    node = new Node(data);
                    index = j;
                    found = true;
                    break;
                }
            }
            if (found == true)
                break;
        }

        node.left = (constructTree(levelOrder, inOrder, inStart, index - 1));
        node.right = (constructTree(levelOrder, inOrder, index + 1, inEnd));
  
        return node;
    }
}
