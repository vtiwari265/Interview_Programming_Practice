package roman_numerals;

public class Convert_Decimal_to_Roman {
	public String intToRoman(int num) {
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String output = "";
        while (num != 0) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > num) {
                    output += roman[i - 1];
                    num -= nums[i-1];
                    found = true;
                    break;
                }
            }
            if (!found) {
                output += "M";
                num -= 1000;
            }
        }
        return output;
    }
}
