package com.nt.leetCode.youtube.easy;

public class LengthOfLastWord {

	public static int lengthOfWord(String ss) {

//		 now we want the length of last word ..
		// use the reverse String ... and if there is any space , give the length
		// of that word

	//	String s = ss.trim();

		int count = 0;

		for (int i = ss.length() - 1; i <= 0; i--) {

			if (ss.charAt(i) != ' ') {
				count++;

			} else {
				break;
			}

		}

		return count;
	}

	public static void main(String[] args) {

		String ss = "Hello world";

		System.out.println(lengthOfWord(ss));

	}
}
