package util;
public class Node {
	public int value;
	public int height;
	public Node left;
	public Node right;
	public Node(int value) {
		this.height = 1;
		this.value = value;
	}
}