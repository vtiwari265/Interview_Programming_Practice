package problems;
public class Rearrange_Positive_And_Negative_Numbers_With_Constant_Space_Problem {	
	public static void sort(int[] arr) {
		int posInd = 0, negInd = 0;
		while ((posInd < arr.length) && (negInd < arr.length)) {
			if ((arr[posInd] > 0) && (arr[negInd] < 0)) {
				if (posInd < negInd) {
					swap(arr, posInd, negInd);
				}
				posInd++;
				negInd++;
				continue;
			}
			if ((arr[posInd] < 0) && (arr[negInd] < 0)) posInd++;
			if ((arr[posInd] > 0) && (arr[negInd] > 0)) negInd++;
		}
	}
	
	public static void swap(int[] arr, int ind1, int ind2) {
		int temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
	}
}