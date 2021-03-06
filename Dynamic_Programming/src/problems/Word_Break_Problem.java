package problems;
/*
 * Dynamic Programming | Set 32 (Word Break Problem)
Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
This is a famous Google interview question, also being asked by many other companies now a days.

Consider the following dictionary 
{ i, like, sam, sung, samsung, mobile, ice, 
  cream, icecream, man, go, mango}

Input:  ilike
Output: Yes 
The string can be segmented as "i like".

Input:  ilikesamsung
Output: Yes
The string can be segmented as "i like samsung" 
or "i like sam sung".
 */

import java.util.*;

public class Word_Break_Problem {
	
	static boolean wordBreak(HashSet<String> dictionary, String find) {
		if (find.length() == 0) return true;
		for (int i = 1; i <= find.length(); i++) {
			System.out.println(i);
			if (dictionary.contains(find.substring(0, i)) && wordBreak(dictionary, find.substring(i, find.length()))) {
				System.out.println("ghghgh");
				return true;
			}
		}
		return false;
	}
}
