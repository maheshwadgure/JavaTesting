package com.qa.programs.strings;

public class ReverseFirstAndLastWord {

	private static void verifyReverseFirstAndLastWord(String input) {

		String[] words = input.split(" ");
		String word = "";

		String result = "";
		for (int i = 0; i < words.length; i++) {
			word = words[i];

			String reverseWord = "";

			if (i == 0 || i == words.length - 1) {

				for (int j = word.length() - 1; j >= 0; j--) {
					// char ch=' ';

					reverseWord = reverseWord + word.charAt(j);
					
					
				}

				result = result + reverseWord + " ";

			} else {
				result = result + word + " ";
			}

		}

		System.out.println(result);

	}

	public static void main(String[] args) {

		String input = "Java is fun and powerful";

		verifyReverseFirstAndLastWord(input);
	}

}
