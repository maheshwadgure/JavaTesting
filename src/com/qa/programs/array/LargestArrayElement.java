package com.qa.programs.array;

public class LargestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 6, 9, 14, 6, 6 };
		findLargestArrayElement(array);

	}

	private static void findLargestArrayElement(int[] array) {
		
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Largest Array Element is :" + max);

	}

}
