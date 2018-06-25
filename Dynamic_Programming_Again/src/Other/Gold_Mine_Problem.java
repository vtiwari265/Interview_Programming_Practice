package Other;

public class Gold_Mine_Problem {
	public static void problem(int[][] mat) {
		int max = 0;
		for (int i = 0; i < mat.length; i++) max = Math.max(recursion(mat, i, 0), max);
		System.out.println(max);
		memo = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) max = Math.max(DP(mat, i, 0), max);
		System.out.println(max);
	}
	
	private static int recursion(int[][] mat, int row, int col) {
		if (mat[row].length == col) return 0;
		int A = 0, B = 0, C = 0;
		if (row > 0) A = recursion(mat, row - 1, col + 1);
		B = recursion(mat, row, col + 1);
		if (row < mat.length - 1) C = recursion(mat, row + 1, col + 1);
		return mat[row][col] + Math.max(Math.max(A,  B), C);
	}
	
	static int[][] memo;
	private static int DP(int[][] mat, int row, int col) {
		if (mat[row].length == col) return 0;
		if (memo[row][col] != 0) return memo[row][col];
		int A = 0, B = 0, C = 0;
		if (row > 0) A = recursion(mat, row - 1, col + 1);
		B = recursion(mat, row, col + 1);
		if (row < mat.length - 1) C = recursion(mat, row + 1, col + 1);
		memo[row][col] = mat[row][col] + Math.max(Math.max(A,  B), C);
		return memo[row][col];
	}
}