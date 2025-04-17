package com.qa.programs.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int array[]= {2,7,6,4,8,6,2};
		verifyReverseArray(array);
		
		
		

	}

	private static void verifyReverseArray(int[] array) {
		
		int first=0;
		int last=array.length-1;
		
		while(last>first)
		{
			int temp=array[first];
			array[first]=array[last];
			array[last]=temp;
			first++;
			last--;
		}
		
		System.out.println("Array is Reverse :"+Arrays.toString(array));
		
	}

}
