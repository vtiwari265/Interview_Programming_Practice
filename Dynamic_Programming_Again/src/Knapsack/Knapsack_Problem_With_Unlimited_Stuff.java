package Knapsack;

public class Knapsack_Problem_With_Unlimited_Stuff {
	public static int memoization(int[] cost, int Weight) {
		int[][] memo = new int[cost.length + 1][Weight + 1];
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < memo[i].length; j++) {
				memo[i][j] = Integer.MAX_VALUE;
				if (i <= j) memo[i][j] = Math.min(memo[i][j], cost[i-1] + memo[i][j - i]); 
				else memo[i][j] = memo[i-1][j];
			}
		}
		int max = Integer.MAX_VALUE;
		for (int i = 1; i < memo.length; i++)
			max = Math.min(max, memo[i][memo[0].length - 1]);
		return max;
	}
}