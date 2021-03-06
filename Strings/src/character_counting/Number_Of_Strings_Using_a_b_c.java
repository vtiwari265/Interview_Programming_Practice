package character_counting;

public class Number_Of_Strings_Using_a_b_c {
	public static int countAll(int k) {
		return count(0, 0, k);
	}
	
	public static int count(int b, int c, int left) {
		if (left == 0) return 1;
		int A, B = 0, C = 0;
		if (b < 1) B = count(b + 1, c, left - 1);
		if (c < 2) C = count(b, c + 1, left - 1);
		A = count(b, c, left - 1);
		return A + B + C;
	}
}
