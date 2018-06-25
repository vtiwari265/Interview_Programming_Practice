package pattern_searching;

/* This is faulty */

import java.util.ArrayList;

public class KMP_Algorithm {	
	public static ArrayList<Integer> search(String txt, String pat) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String compare = txt.substring(0, pat.length());
		for (int i = 0; i < txt.length() - pat.length() + 1; i++) {
			System.out.println(i + " " + compare);
			if (pat.equals(compare)) arr.add(i);
			compare = compare.substring(1) + txt.charAt(pat.length() + i);
		}
		return arr;
	}
}