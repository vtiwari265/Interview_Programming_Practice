package problems;
import java.util.Stack;

public class Smallest_Number_On_Left_Of_An_Array_Problem {
	
	public static void find(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		boolean done;
		for (int i = 0; i < arr.length; i++) {
			done = false;
			Stack<Integer> temp = new Stack<Integer>();
			temp.addAll(st);
			while (!temp.isEmpty()) {
				Integer popped = temp.pop();
				if (popped < arr[i]) {
					done = true;
					System.out.print(popped + " ");
					break;
				}
			}
			st.push(arr[i]);
			if (!done) System.out.print("_ ");
		}
	}
}
