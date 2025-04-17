package com.qa.programs.strings;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Mahesh";
		findCharacterOccurance(input);

	}

	private static void findCharacterOccurance(String input) {

		char[] chaarray = input.toCharArray();
		boolean[] repeatcheck = new boolean[chaarray.length];
		int counter = 1;
		
		for (int i = 0; i < chaarray.length; i++) {

			if (repeatcheck[i]) {
				continue;
			}
			
			counter=1;

			for (int j = i + 1; j < chaarray.length; j++) {
				if (chaarray[i] == chaarray[j]) {
					counter++;
					repeatcheck[j] = true;
				}
			}
			System.out.println("Print the Character :"+chaarray[i]+"  "+"Occurance is : "+counter);
		}

	}

}
