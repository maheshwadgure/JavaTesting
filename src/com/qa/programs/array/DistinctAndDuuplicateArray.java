package com.qa.programs.array;

public class DistinctAndDuuplicateArray {

	public static void main(String[] args) {
		
		int array[]= {1,5,4,3,2,8,7,6,1,4};
		
		findDistinctAndDuuplicateArray(array);

	}

	private static void findDistinctAndDuuplicateArray(int[] array) {
		
		System.out.println("Print the duplacate array element :");
		//Navigate across the different array element
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				//compare the first and next element in array
				 if(array[i]==array[j])
				 {
					 
					 System.out.print(array[i]+" ");
					 break;
				 }
				
			}
			
		}
		
		System.out.println("\nPrint the Distinct array element :");
		//Navigate across the different array element
		for(int i=0;i<array.length;i++)
		{
			boolean isDistinct=true;
			
			for(int j=0;j<array.length;j++)
			{
				//compare the first and next element in array
				 if(array[i]==array[j] && i!=j)
				 {
					 
					 isDistinct=false;
					 break;
				 }
				
			}
			
			if(isDistinct)
			{
				System.out.print(array[i]+ " ");
			}
		}
		
	}

}
