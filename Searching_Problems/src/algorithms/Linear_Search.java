package algorithms;

public class Linear_Search {
	public static int linear_Search(int[] arr, int find) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == find) return i;
		}
		return -1;
	}
}