package problems;
import java.util.HashSet;

public class Kth_Smallest_Element_After_Removing_Integers_Problem {
	public static void main(String[] args) {
		int arr[] = {1};
		int k = 1;
		System.out.println(find(arr, k));
	}
	
	public static int find(int[] arr, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int count = 1;
		while (true) {
			if (set.contains(count)) {
				k++;
			}
			k--;
			if (k == 0) {
				return count;
			}
			count++;
		}
	}
}
