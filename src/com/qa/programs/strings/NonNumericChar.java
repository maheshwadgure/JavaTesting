package com.qa.programs.strings;

public class NonNumericChar {

	public static void main(String[] args) {
		
		String input="Mah@@12#$%";
		printNonNumericChar(input);
		

	}

	private static void printNonNumericChar(String input) {
		
		char ch=' ';
		
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			
			if(Character.isDigit(ch))
			{
				
			}
			else {
				System.out.println("Print Non Numeric Character : "+ch);
			}
			
		}
		
	}

}
