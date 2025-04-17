package com.qa.programs.strings;

public class StringLargestNumber {

	public static void main(String[] args) {

		String input = "jsdh186237hggs89d";
		findLargestDigitFromString(input);

	}

	public static void findLargestDigitFromString(String input) {
		int max = 0;
		char ch = ' ';
		for (int i = 0; i < input.length(); i++) {

			ch = input.charAt(i);

			if (Character.isDigit(ch)) {
				
				int num = ch - '0';

				if (num > max) {
					max = num;
				}

			}

		}

		System.out.println("Print the Largest Number :" + max);
	}

}
