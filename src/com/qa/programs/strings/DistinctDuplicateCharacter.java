package com.qa.programs.strings;

public class DistinctDuplicateCharacter {

	public static void main(String[] args) {

		String input = "Mahesh";

		findDistinctDuplicateCharacter(input);

	}

	private static void findDistinctDuplicateCharacter(String input) {

		char[] chararray = input.toCharArray();

		System.out.println("Print the Duplicate Character");

		// Navigate across the character element
		for (int i = 0; i < chararray.length; i++) {
			for (int j = i + 1; j < chararray.length; j++) {
				if (chararray[i] == chararray[j]) {
					System.out.println(chararray[i]);
					break;
				}
			}

		}

		System.out.println("Print the Distinct Character :");

		// Navigate across the character element
		for (int i = 0; i < chararray.length; i++) {
			 
			boolean isDistinct=true;
			
			for (int j = 0; j < chararray.length; j++) {
				if (chararray[i] == chararray[j] && i!=j) {
					
					isDistinct=false;
					break;
				}
			}

			if(isDistinct)
			{
				System.out.print(chararray[i]+ " ");
			}
		}

	}

}
