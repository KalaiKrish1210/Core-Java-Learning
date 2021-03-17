package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class ReplaceInitialAtlast {
	public static void main(String[] args) {
		String first, a = " ";
		// "a" we have to initiate string like a=""
		Scanner sc = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the string");
		first = sc.nextLine();
		// Getting the string value from user
		int b = first.length();
		// Calculating the length of the string
		for (int i = 2; i < b; i++) {
			// print the string from index of 2
			a = a + first.charAt(i);
		}

		String c = "";
		// initiating the c variable
		c = c + first.charAt(0);
		// print the initial value at last with help of the "charAt" to access the index
		// and print
		System.out.println("the name is :" + a + "." + c);

	}

}
