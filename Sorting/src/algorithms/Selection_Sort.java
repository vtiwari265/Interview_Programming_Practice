package algorithms;

public class Selection_Sort {
	public static void sort(int[] arr) {
		int min, minIndex;
		for (int i = 0; i < arr.length; i++) {
			min = Integer.MAX_VALUE;
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
}
