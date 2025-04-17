package com.qa.programs.number;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 33;

		if (verifyPrimeNumber(number)) {
			System.out.println("Number is Prime Number");
		}

		else {
			System.out.println("Number is Non Prime Number");
		}

	}

	private static boolean verifyPrimeNumber(int number) {

		if (number <= 1) {
			return false;

		}

		else {
			for (int i = 2; i < number; i++) {
				if (number % 2 == 0) {
					return false;

				}

			}

		}

		return true;

	}

}
