package character_counting;

public class Return_Maximum_Occurring_Character_In_An_Input_String {	
	public static char find(String string) {
		int[] chars = new int[128];
		int max = 0;
		char maxChar = 0;
		for (int i = 0; i < string.length(); i++) {
			chars[string.charAt(i)]++;
			if (chars[string.charAt(i)] > max) {
				max = chars[string.charAt(i)];
				maxChar = string.charAt(i);
			}
		}
		return maxChar;
	}
}
