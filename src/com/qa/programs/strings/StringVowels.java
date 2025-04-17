package com.qa.programs.strings;

public class StringVowels {

	public static void main(String[] args) {
		
		String input="Mahesh";
		
		findStringVowels(input);

	}

	private static void findStringVowels(String input) {
		
		char ch=' ';
		
		for(int i=0;i<input.length();i++)
		{
			
			ch=input.charAt(i);
			
			if(verifyVowels(ch))
			{
				System.out.println("Print the Vowel Characters :"+ch);
				
			}
			
			
		}
		
	}

	private static boolean verifyVowels(char ch) {
		
		if(ch =='a' ||ch =='e' ||ch =='i' ||ch =='o' ||ch =='u')
		{
			return true;
		}
		return false;
	}

}
