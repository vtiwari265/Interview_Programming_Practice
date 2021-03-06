package checking;

import java.util.HashSet;

import util.Node;

public class Check_If_A_Binary_Tree_Is_Graph {
	static HashSet<Node> set;
	static boolean found;
	public static boolean check(Node root) {
		set = new HashSet<Node>();
		found = true;
		checkTree(root);
		return found;
	}
	
	public static void checkTree(Node root) {
		if (root == null) return;
		if (!set.contains(root)) {
			found = false;
			return;
		}
		else set.add(root);
		checkTree(root.left);
		checkTree(root.right);
	}
}

/*Check if a given graph is tree or not
Write a function that returns true if a given undirected graph is tree and false otherwise. For example, the following graph is a tree.

cycleGraph

But the following graph is not a tree.
cycleGraph

An undirected graph is tree if it has following properties.
1) There is no cycle.
2) The graph is connected.

For an undirected graph we can either use BFS or DFS to detect above two properties.
*/