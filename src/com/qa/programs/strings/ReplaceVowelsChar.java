package com.qa.programs.strings;

public class ReplaceVowelsChar {

	public static void main(String[] args) {
		
		String input="Mahesh";
		
		verifyReplaceVowelsChar(input);

	}

	private static void verifyReplaceVowelsChar(String input) {
	
		String replace="";
		
		char replaceChar='*';
		
		char ch=' ';
		
		//Iterate across the characters
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			
			if(verifyWowels(ch))
			{
				replace=replace+replaceChar;
			}
			else {
				replace=replace+ch;
			}
			
		}
		System.out.println(replace);
	}

	private static boolean verifyWowels(char ch) {
		
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='0' ||ch=='u')
		{
			return true;
		}
		
		return false;
	}

}
