package palindrome;

public class Check_If_A_Given_String_Is_A_Rotation_Of_A_Palindrome {	
	public static boolean check(String string) {
		int count = 0;
		int[] arr = new int[128];
		for (int i = 0; i < string.length(); i++) arr[(int)string.charAt(i)]++;
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 2) == 1) count++;
		}
		if (count == 1 && (string.length()%2 == 1)) return true;
		if (count == 0) return true;
		return false;
	}
}