package com.qa.programs.number;

public class DigitOccurance {

	public static void main(String[] args) {

		
		long number = 99567788992399887L; // Large number stored as long
        
        int[] digitCount = new int[10]; // Array to count occurrences of digits (0-9)
        
        int[] digitCount1 = {1,2,3,4,5,6,7,8,9,10};
        
        System.out.println(digitCount.length);
        System.out.println(digitCount1.length);
        
        // Count occurrences of each digit
        long temp = number;
        while (temp > 0) {
            int digit = (int) (temp % 10); // Extract last digit
            digitCount[digit]++;
            temp /= 10; // Remove last digit
        }
        
        // Print digits that repeat more than twice
        System.out.println("Digits that repeat more than twice:");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 0) {
                System.out.println("Digit: " + i + " -> Count: " + digitCount[i]);
            }
        }
    }
}