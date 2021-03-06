package problems;
/*
 * Dynamic Programming | Set 10 ( 0-1 Knapsack Problem)
 * Given weights and values of n items, put these items in a knapsack 
 * of capacity W to get the maximum total value in the knapsack. In 
 * other words, given two integer arrays val[0..n-1] and wt[0..n-1] which 
 * represent values and weights associated with n items respectively. Also 
 * given an integer W which represents knapsack capacity, find out the maximum 
 * value subset of val[] such that sum of the weights of this subset is smaller 
 * than or equal to W. You cannot break an item, either pick the complete item, 
 * or don’t pick it (0-1 property).
 */

public class Knapsack_Problem {
	static int knapsack(int[] value, int[] weight, int maximumWeight) {
	    int[][] memo = new int[value.length + 1][maximumWeight + 1];
	    for (int i = 0; i <= value.length; i++) {
	        for (int j = 0; j <= maximumWeight; j++) {
	            if (i == 0 || j == 0) memo[i][j] = 0;
	            else if (weight[i-1] <= j) memo[i][j] = Math.max(memo[i-1][j], value[i-1] + memo[i-1][j - weight[i-1]]);
	            else memo[i][j] = memo[i-1][j];
	        }
	    }
	    return memo[value.length][maximumWeight];
	}
}
