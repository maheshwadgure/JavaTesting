package com.qa.programs.strings;

public class ReverseWordsInString {
	
	private static void ReverseWordsInString(String input) {
		
		String[] words= input.split(" ");
		
		String wordReverse="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			wordReverse=wordReverse+words[i]+" ";
			
		}
		
		System.out.println(wordReverse);
	}


	public static void main(String[] args) {
		
		String input="I am Mahesh Wadgure From Chandrapur";
		ReverseWordsInString(input);
				

	}

	
}
