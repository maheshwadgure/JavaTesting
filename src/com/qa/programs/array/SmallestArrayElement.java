package com.qa.programs.array;

public class SmallestArrayElement {

	public static void main(String[] args) {

		int[] array = { 2, 7, 8, 10, 6, 1, 5 };

		findSmallestArrayElement(array);

	}

	private static void findSmallestArrayElement(int[] array) {

		int smallElement = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] < smallElement) {
				smallElement = array[i];
			}

		}

		System.out.println("Print the Smallest Array Element  :" + smallElement);
	}

}
