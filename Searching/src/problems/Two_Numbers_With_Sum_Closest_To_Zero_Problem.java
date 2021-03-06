package problems;
/*
 * Two elements whose sum is closest to zero
Question: An Array of integers is given, both +ve and -ve. You need to find the two elements such that their sum is closest to zero.
 */

import java.util.Arrays;

public class Two_Numbers_With_Sum_Closest_To_Zero_Problem {
	public static void find(int[] arr) {
	    Arrays.sort(arr);
	    int lo = 0, hi = arr.length - 1, sum, minSum = Integer.MAX_VALUE, absLo = -1, absHi = -1;
	    sum = arr[lo] + arr[hi];
        if (Math.abs(sum) < minSum) {
            absLo = lo;
            absHi = hi;
        }
	    while (hi > lo + 1) {
	        if (sum == 0) {
	            System.out.println(arr[lo] + " " + arr[hi]);
	            return;
	        }
	        else if (sum > 0) {
	            if ((arr[lo] + arr[hi - 1]) < sum) hi -= 1;
	            else {
	                System.out.println(arr[lo] + " " + arr[hi]);
	                return;
	            }
	        }
	        else if (sum < 0) {
	            if ((arr[lo + 1] + arr[hi]) > sum) lo += 1;
	            else {
	                System.out.println(lo + " " + hi);
	                return;
	            }
	        }
	        sum = arr[lo] + arr[hi];
	        if (Math.abs(sum) < minSum) {
	            absLo = lo;
	            absHi = hi;
	        }
	    }
	    System.out.println(arr[absLo] + " " + arr[absHi]);
	}
}
