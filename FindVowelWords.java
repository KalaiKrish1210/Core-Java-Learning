package com.kalai;

import java.util.Scanner;
//Scanner package importing 

public class FindVowelWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scannr method Syntax
		String a;
		int j = 0, b;
		char ch;
		System.out.println("Enter the String :");
		a = input.nextLine();
		// Getting the String value from user
		b = a.length();
		// calculating the length of the String
		System.out.println("The String length is :" + b);
		for (int i = 0; i < b; i++) {
			ch = a.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				j++;

				System.out.println("\nThe vowel strings are " + ch);
			}

		}
		System.out.println("count of the vowels:" + j);
		// Calculating the count of vowel words and if the count is getting zero value
		// print the "if" Statment
		if (j == 0) {
			System.out.println("In this string is not have a vovel letters");

		}

	}

}
