package traversal;
import util.Node;

public class Boundary_Traversal_Print {
	public static void boundary(Node root) {
		printBoundaryLeft(root);
		printLeaves(root);
		printBoundaryRight(root);
	}
	
    static void printLeaves(Node node) {
        if (node != null) {
            printLeaves(node.left);
            if (node.left == null && node.right == null) System.out.print(node.value + " ");
            printLeaves(node.right);
        }
    }
  
    static void printBoundaryLeft(Node node) {
        if (node != null) {
            if (node.left != null) {
                System.out.print(node.value + " ");
                printBoundaryLeft(node.left);
            } 
            else if (node.right != null) 
            {
                System.out.print(node.value + " ");
                printBoundaryLeft(node.right);
            }
        }
    }
  
    static void printBoundaryRight(Node node) {
        if (node != null) {
            if (node.right != null) {
                printBoundaryRight(node.right);
                System.out.print(node.value + " ");
            } 
            else if (node.left != null) {
                printBoundaryRight(node.left);
                System.out.print(node.value + " ");
            }
        }
    }
}