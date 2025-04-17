package com.qa.programs.array;

public class CompareArray {

	public static void main(String[] args) {

		int arar1[] = { 1, 2, 3, 4, 5, 6,7 };
		int arar2[] = { 1, 2, 3, 4, 5, 7 };

		if (compareArray(arar1, arar2)) {

			System.out.println("Both the array are same");
		}

		else

		{
			System.out.println("Both the array are Not same");
		}

	}

	private static boolean compareArray(int[] arar1, int[] arar2) {

		// First Verify the lengh of the both array
		if (arar1.length == arar2.length) {
			// Iterate across the array Element

			for (int i = 0; i < arar1.length; i++) {

				// comparea both array element one by one
				if (arar1[i] != arar2[i]) {

					return false;

				}

			}
			return true;
		}
		return false;

	}

}
