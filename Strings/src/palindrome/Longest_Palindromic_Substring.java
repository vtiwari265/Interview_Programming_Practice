package palindrome;

import java.util.HashSet;
import java.util.Iterator;

/* This is faulty */

class longPalindromes {
	static HashSet<String> arr = new HashSet<String>();
}

public class Longest_Palindromic_Substring {
	
	
	public static void main(String[] args) {
		System.out.println(findLongest("forgeeksskeegfor"));
	}
	
	public static String findLongest(String string) {
		find(string);
		int maxLength = 0;
		String maxString = "";
		
		Iterator<String> itr= longPalindromes.arr.iterator();  
		while(itr.hasNext()) { 
			String temp = itr.next();
			if (temp.length() > maxLength) {
				maxLength = temp.length();
				maxString = temp;
			}
		}
		return maxString;
	}
	
	private static String find(String string) {
		if (string.length() == 1) {
			longPalindromes.arr.add(string);
			return string;
		}
		if (string.length() == 2) {
			if (string.charAt(0) == string.charAt(1)) {
				longPalindromes.arr.add(string.substring(0,1));
				longPalindromes.arr.add(string);
				return string;
			}
			else {
				longPalindromes.arr.add(string.substring(0,1));
				longPalindromes.arr.add(string.substring(1,2));
				return "";
			}
		}
		if (string.charAt(0) == string.charAt(string.length() - 1)) {
			String temp = find(string.substring(1, string.length() - 1));
			if (temp.length() > 0) {
				longPalindromes.arr.add(string);
				return string;
			}
			else
				return "";
		}
		else {
			find(string.substring(0, string.length() - 1));
			find(string.substring(1, string.length()));
			return "";
		}
	}
}
