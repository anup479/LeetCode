package com.nt.oneOneZero.Day_1;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	// remove white spaces..

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" please enter the input String");
		String inputString = sc.nextLine();

		System.out.println(inputString);

		// now to remove the white spaces .
		String replaceAll = inputString.replaceAll("\\s", "");
		System.out.println("Input String" + inputString);

		System.out.println(" no spaces " + replaceAll);
		sc.close();
	}
}
