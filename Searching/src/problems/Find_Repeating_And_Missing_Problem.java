package problems;
/*
 * Find the repeating and the missing | Added 3 new methods
Given an unsorted array of size n. Array elements are in range from 1 to n. One number from set {1, 2, …n} is missing and one number occurs twice in array. Find these two numbers.

Examples:

  arr[] = {3, 1, 3}
  Output: 2, 3   // 2 is missing and 3 occurs twice 

  arr[] = {4, 3, 6, 2, 1, 1}
  Output: 1, 5  // 5 is missing and 1 occurs twice 
 */

import java.util.HashSet;

public class Find_Repeating_And_Missing_Problem {
	public static void find(int[] arr) {
	    HashSet<Integer> hs = new HashSet<Integer>();
	    int maximum = Integer.MIN_VALUE;
	    int repeat = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (hs.contains(arr[i])) repeat = arr[i];
	        else hs.add(arr[i]);
	        maximum = Math.max(arr[i], maximum);
	    }
	    int totalSum = ((maximum*(maximum + 1))/2) + repeat;
	    for (int i = 0; i < arr.length; i++) {
	        totalSum -= arr[i];
	    }
	    System.out.println(repeat + " " + totalSum);
	}
}
