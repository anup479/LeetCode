package com.nt.leetCode75;

public class MergeStringAlternatively {

	public String mergeAlernat(String s1, String s2) {

		StringBuilder result = new StringBuilder();

		int i = 0;

		// mearge the characters

		while (i < s1.length() && i < s2.length()) {

			result.append(s1.charAt(i));
			result.append(s2.charAt(i));
			i++;
		}

		// do it for the ramining chacraters too

		while (i < s1.length()) {
			result.append(s1.charAt(i));
			i++;
		}

		// do it for the another one

		while (i < s2.length()) {
			result.append(s2.charAt(i));
			i++;
		}

		return result.toString();

	}
}