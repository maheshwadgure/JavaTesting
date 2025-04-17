package com.qa.programs.strings;

public class PalimdromeString {

	public static void main(String[] args) {

		String input = "Noon";

		verifyPalimdromeString(input);

	}

	private static void verifyPalimdromeString(String input) {

		String reverse = "";
		//char ch = ' ';

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);

		}

		if (input.equalsIgnoreCase(reverse)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palimdrome");
		}

	}

}
