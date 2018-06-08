/* This is faulty */

package construction;

import java.util.ArrayList;

import util.Node;

public class Levelorder_To_Binary_Search_Tree {	
	public static Node construct(int[] level) {
		ArrayList<Node> prev = new ArrayList<Node>();
		ArrayList<Node> toBeAdded = new ArrayList<Node>();
		Node root = new Node(level[0]);
		toBeAdded.add(root);
		for (int i = 1; i < level.length; i++) {
			if (level[i] < level[i-1]) {
				prev.clear();
				prev.addAll(toBeAdded);
				toBeAdded.clear();
			}
			Node node = new Node(level[i]);
			toBeAdded.add(node);
			for (int j = 0; j < prev.size(); j++) {
				if (prev.get(j).value > node.value) {
					if (j == 0) {
						prev.get(j).left = node;
						break;
					}
					else {
						if (prev.get(j-1).right == null) {
							prev.get(j-1).right = node;
							break;
						}
						else {
							prev.get(j).left = node;
							break;
						}
					}
				}
				else if (node.value > prev.get(prev.size() - 1).value) {
					prev.get(prev.size() - 1).right = node;
					break;
				}
			}
		}
		return root;
	}
}