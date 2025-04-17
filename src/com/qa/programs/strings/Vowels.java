package com.qa.programs.strings;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Mahesh";
		printVowels(input);

	}

	private static void printVowels(String input) {

		char ch = ' ';
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);

			if (verifyVowels(ch)) {
				System.out.println("Print the Vowels Character from STring :" + ch);
			}

		}

	}

	private static boolean verifyVowels(char ch) {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

			return true;
		else

			return false;
	}

}
