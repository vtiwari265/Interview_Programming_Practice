package miscellaneous;

import java.util.ArrayList;

class interleavings {
	static ArrayList<String> arr = new ArrayList<String>();
}

public class Print_Interleavings_Of_Two_Strings {
	public static ArrayList<String> print(String string1, String string2) {
		ArrayList<Character> arr1 = new ArrayList<Character>();
		ArrayList<Character> arr2 = new ArrayList<Character>();
		for (int i = 0; i < string1.length(); i++) arr1.add(string1.charAt(i));
		for (int i = 0; i < string2.length(); i++) arr2.add(string2.charAt(i));
		ArrayList<Character> arr11 = (ArrayList<Character>) arr1.clone();
		ArrayList<Character> arr22 = (ArrayList<Character>) arr2.clone();
		printAll(arr1, arr2, "");
		printAll(arr22, arr11, "");
		return interleavings.arr;
	}
	
	private static void printAll(ArrayList<Character> arr1, ArrayList<Character> arr2, String string) {
		if ((arr1.size() == 0) && (arr2.size() == 0)) {
			interleavings.arr.add(string);
			return;
		}
		string += arr1.get(0);
		arr1.remove(0); 
		if (arr1.size() == 0) 
			printAll(arr2, arr1, string);
		else if (arr2.size() == 0) 
			printAll(arr1, arr2, string);
		else {
			ArrayList<Character> arr11 = (ArrayList<Character>) arr1.clone();
			ArrayList<Character> arr22 = (ArrayList<Character>) arr2.clone();
			printAll(arr1, arr2, string);
			printAll(arr22, arr11, string);
			
		}
	}
}