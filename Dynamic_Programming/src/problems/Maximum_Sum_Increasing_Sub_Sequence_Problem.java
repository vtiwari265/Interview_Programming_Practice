package problems;
/*
 * Given an array of n positive integers. 
 * Write a program to find the sum of maximum sum subsequence of the given array such that the integers in the subsequence are sorted in increasing order. 
 * For example, if input is {1, 101, 2, 3, 100, 4, 5}, then output should be 106 (1 + 2 + 3 + 100), if the input array is {3, 4, 5, 10}, 
 * then output should be 22 (3 + 4 + 5 + 10) and if the input array is {10, 5, 4, 3}, then output should be 10
 */

public class Maximum_Sum_Increasing_Sub_Sequence_Problem {
	static int MSIDP(int[] arr) {
	    int[] memoDP = new int[arr.length];
	    
	    for (int i = 0; i < arr.length; i++) {
	        memoDP[i] = arr[i];
	    }
	    int maximum = memoDP[0];
	    
	    for (int i = 1; i < arr.length; i++) {
	        for (int j = 0; j < i; j++) {
	            if (arr[i] > arr[j]) {
	                memoDP[i] = Math.max(memoDP[i], arr[i] + memoDP[j]);
	                maximum = Math.max(maximum, memoDP[i]);
	            }
	        }
	    }
	    return maximum;
	}
}
