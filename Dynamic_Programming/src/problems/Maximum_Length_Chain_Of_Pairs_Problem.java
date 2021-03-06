package problems;
/*
 * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number. 
 * A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. 
 * Find the longest chain which can be formed from a given set of pairs. Source: Amazon Interview | Set 2
 * 
 * For example, if the given pairs are {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90}}, 
 * then the longest chain that can be formed is of length 3, and the chain is {{5, 24}, {27, 40}, {50, 90}}
 */

public class Maximum_Length_Chain_Of_Pairs_Problem {

	static int MLCOPDP(int[] arr) {
		int[] memoDP = new int[arr.length/2];
		
		for (int i = 0; i < arr.length/2; i++) {
	        memoDP[i] = 1;
	    }
		int maximum = memoDP[0];
		
		for (int i = 2; i < arr.length; i += 2) {
			for (int j = 1; j < i; j += 2) {
				if (arr[j] < arr[i]) {
					memoDP[(int)(i/2)] = Math.max(memoDP[(int)(i/2)], 1 + memoDP[(int)(j/2)]); 
					maximum = Math.max(maximum, memoDP[(int)(i/2)]);
				}
			}
		}
		return maximum;
	}
}
