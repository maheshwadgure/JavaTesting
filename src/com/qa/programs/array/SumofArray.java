package com.qa.programs.array;

public class SumofArray {

	public static void main(String[] args) {

		int array[] = { 2, 6, 5, 4, 1 };

		verifySumofArray(array);

	}

	private static void verifySumofArray(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];

		}

		System.out.println("Sum of Array is :" + sum);

	}

}
