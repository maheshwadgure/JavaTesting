package com.qa.programs.strings;

public class PrintInitialCharacter {

	public static void main(String[] args) {

		String input = "I am Mahesh Wadgure";

		printInitialChar(input);

	}

	private static void printInitialChar(String input) {

		char[] chararray = input.toCharArray();

		for (int i = 0; i < chararray.length; i++) {

			if (i == 0) {
				System.out.println("Print the Initial Character of Words :"+chararray[i]);
			}
			if (chararray[i] == ' ') {
				i++;
				System.out.println("Print the Initial Character of Words :"+chararray[i]);
			}

		}

	}
}
