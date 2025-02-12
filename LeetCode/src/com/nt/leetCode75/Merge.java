package com.nt.leetCode75;

//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"

public class Merge {

	public static String mergee(String s1, String s2) {

		// now u cannot alter in String to create Stringg buffer

		StringBuffer sb = new StringBuffer();
		int start = 0;
		int s1_len = s1.length();
		int s2_len = s2.length();

		while (start < s1_len && start < s2_len) {
			sb.append(s1.charAt(start));
			sb.append(s2.charAt(start));
			start++;
		}

		// append remaining characters from s1
		while (start < s1.length()) {
			sb.append(s1.charAt(start));
			start++;
		}

		// append remaining characters from s2
		while (start < s2.length()) {
			{
				sb.append(s2.charAt(start));
				start++;
			}

			return sb.toString();
		}

	}

	public static void main(String[] args) {

	}
}
