package com.qa.programs.strings;

public class RemoveDuplicateStringChar {

	public static void main(String[] args) {

		String input = "Mahesh";

		verifyRemoveDuplicate(input);

	}

	private static void verifyRemoveDuplicate(String input) {

		// converts the strings to array of characters
		char[] chararray = input.toCharArray();

		// declare empty string
		String replace = "";

		// Iterate across the element
		for (int i = 0; i < chararray.length; i++) {
			// To check the Element is duplicate or Not
			boolean isDuplicate = false;

			for (int j = 0; j < replace.length(); j++) {
				// compare the character and if duplicate or not
				if (chararray[i] == replace.charAt(j)) {
					isDuplicate = true;
					break;

				}

			}

			// if the character is not Duplicate
			if (!isDuplicate) {

				replace = replace + chararray[i];
			}
		}
		System.out.println("Remove the Duplicates :  " + replace);
	}

}
