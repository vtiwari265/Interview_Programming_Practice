package character_counting;

public class Maximum_Consucutive_Repeating_Character_In_A_String {
	public static void main(String[] args) {
		System.out.println(find("aaaabbcbbb"));
	}
	
	public static char find(String string) {
		int maxCount = 0, count = 0, index = 0;
		char temp, maxChar = ' ';
		while (index < string.length()) {
			count = 1;
			temp = string.charAt(index);
			while ((index < string.length()) && (string.charAt(index) == temp)) {
				count++;
				index++;
			}
			if (count > maxCount) {
				maxCount = count;
				maxChar = string.charAt(index - 1);
			}
		}
		return maxChar;
	}
}
