package construction;

import util.Node;

public class Inorder_And_Postorder_To_Binary_Tree {	
	static int pIndex;
	public static Node buildUtil(int in[], int post[], int inStrt, int inEnd) {
        if (inStrt > inEnd) return null;
        Node node = new Node(post[pIndex]);
        pIndex--;
        if (inStrt == inEnd) return node;
        int iIndex = search(in, inStrt, inEnd, node.value);
        node.right = buildUtil(in, post, iIndex + 1, inEnd);
        node.left = buildUtil(in, post, inStrt, iIndex - 1);
        return node;
    }

    public static Node buildTree(int in[], int post[]) {
    	pIndex = in.length - 1;
        return buildUtil(in, post, 0, in.length - 1);
    }
    
    public static int search(int arr[], int strt, int end, int value) {
        int i;
        for (i = strt; i <= end; i++)  {
            if (arr[i] == value) break;
        }
        return i;
    }
}
