package problems;

public class Length_of_Unsorted_Array_Problem {
	public static void sort(int[] arr) {
	    int lo = arr.length - 1;
	    int highest = Integer.MIN_VALUE; 
	    int hi = 0;
	    int lowest = Integer.MAX_VALUE;
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > highest) highest = arr[i];
	        else hi = i;
	    }
	    for (int i = arr.length - 1; i >= 0; i--) {
	        if (arr[i] < lowest) lowest = arr[i];
	        else lo = i;
	    }
	    System.out.println(lo + " " + hi);
	}
}
