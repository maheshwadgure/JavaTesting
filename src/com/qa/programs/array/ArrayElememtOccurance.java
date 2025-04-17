package com.qa.programs.array;

public class ArrayElememtOccurance {

	public static void main(String[] args) {
	
		int [] array= {1,2,5,6,7,4,5,4,4,5};
		
		verifyArrayElememtOccurance(array);

	}

	private static void verifyArrayElememtOccurance(int[] array) {
		
		//Iterate Across the Array Element
		int counter=1;
		
		boolean [] repeatcheck=new boolean[array.length];
		
		for(int i=0;i<array.length;i++)
		{
			if(repeatcheck[i])
			{
				continue;
			}
			
			counter=1;
			
			for(int j=i+1;j<array.length;j++)
			{
				//compare if the element is multiple time
				
				if(array[i]==array[j])
				{
					counter++;
					
					repeatcheck[j]=true;
					
				}
				
			}
			
			System.out.println("Print the Character Occurance of Element :"+array[i]+"  is "+counter);
		}
		
	}

}
