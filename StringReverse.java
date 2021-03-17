package com.kalai;

import java.util.Scanner;
//Scanner method package importing

class StringReverse {
	public static void main(String[] args) {
		String firstValue, secondValue = "";
		// intiate the secondValue
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the string:");
		firstValue = input.nextLine();
		// Getting the string value from user
		int length = firstValue.length();
		// Calculating the length of the user given string using the string method
		// ".length()"
		for (int i = length - 1; i >= 0; i--) {
			// Calculating the length of the String it get the length from the zeroth index
			// that's why we have to "length -1"
			secondValue = secondValue + firstValue.charAt(i);
		}
		System.out.println("the reversed string is :" + secondValue);
	}

}
