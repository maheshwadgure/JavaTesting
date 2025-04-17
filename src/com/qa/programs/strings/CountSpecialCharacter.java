package com.qa.programs.strings;

public class CountSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "kjdas%%@ff!!GG%%";

		countSpecialCharacter(input);

	}

	private static void countSpecialCharacter(String input) {

		char ch = ' ';

		int counter = 0;
		int counter1=0;

		for (int i = 0; i < input.length(); i++) {
			
			ch = input.charAt(i);
			
			if(!Character.isLetterOrDigit(ch))
			{
				counter++;
			} 
			
			if(Character.isDigit(ch))
			{
				
			}
			else if (Character.isLetter(ch)) {
				
			}else 
			{
				counter1++;
			}

		}
		System.out.println(counter);
		System.out.println(counter1);
	}

}
