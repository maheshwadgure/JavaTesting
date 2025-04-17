package com.qa.programs.number;

public class NumberDigitOccurance {

	private static void verifydigitOccurance(long number) {
		
		int digitcount[]=new int [10];
		long tempNumber=number;
		
		while(tempNumber>0)
		{
			int digit=(int)(tempNumber%10);
			digitcount[digit]++;
			tempNumber=tempNumber/10;
			
		}
		
		for(int i=0;i<10;i++)
		{
			if(digitcount[i]>0)
			{
				System.out.println("Digit count"+digitcount[i]+"   Digit is "+i);
				
			}
		}
		
		
	}

	
	public static void main(String[] args) {
		
		long number=46284227628482l;
		
		verifydigitOccurance(number);
		
	}

	
}
