package com.qa.programs.number;

class SwapTwoNumber {

	public static void SwapTwoNumberUsingThirdVaiable(int x, int y, int temp) {
		temp = x;
		x = y;
		y = temp;

		System.out.println("After Swaping Number :" + "Values of X is :" + x + " " + "Values of Y is " + y);
	}

	public static void main(String[] args) {

		int x = 4;
		int y = 6;
		int temp = 0;

		SwapTwoNumberUsingThirdVaiable(x, y, temp);

	}
}