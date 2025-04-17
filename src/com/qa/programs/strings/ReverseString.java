package com.qa.programs.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String input="Mahesh";
		
		verifyReverseString(input);
		
		

	}

	private static void verifyReverseString(String input) {
		
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			
			reverse=reverse+input.charAt(i);
			
		}
		
		System.out.println("Reverse the given string :  "+reverse);
		
	}

}
