package util;

public class Main {
	public static void main1(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		root.right = new Node(10);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);
	}
}