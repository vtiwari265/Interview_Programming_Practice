package zig_zig;

import rotation.Right_Rotation;
import util.Node;

public class Zig_Zig_Right_Right {
	public static Node zig_zig(Node root) {
		return Right_Rotation.right(Right_Rotation.right(root));
	}
}
