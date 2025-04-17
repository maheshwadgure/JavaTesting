package com.qa.programs.strings;

public class DigitSum {

	public static void main(String[] args) {
		
		String input="Mahesh6764Test768632";
		
		printDigitSum(input);

	}

	private static void printDigitSum(String input) {
		
		char ch=' ';
		int digit=0;
		int sum=0;
		
		
		for(int i=0;i<input.length();i++)
		{
			ch=input.charAt(i);
			
			if(Character.isDigit(ch)) 
			{
				
				digit=ch-'0';
				sum=sum+digit;
				
			}
			
		}
		System.out.println("Sum of all the Digit Character is :"+sum);
		
	}

}
