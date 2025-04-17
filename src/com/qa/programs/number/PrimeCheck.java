package com.qa.programs.number;

public class PrimeCheck {
	
	private static boolean findPrimeNumber(int Number) {
		
		while(Number>1) {
			
			if(Number==2)
			{
				return true;
			}
			
			if(Number%2==0)
			{
				return false;
			}
			
			return true;
			
		}
		return true;
		
	}


	public static void main(String[] args) {
		
		int primeNumber=4;
		if(findPrimeNumber(primeNumber))
		{
			System.out.println("Number is Prime Number");
		}
		else 
			System.out.println("Number is not Prime Number");
		

	}

	
}
