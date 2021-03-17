package com.kalai;

import java.util.Scanner;
//Scanner method package

public class NumIntegerReverse {

	public static void main(String[] args) {
		int a, b = 0;
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the Value you want to reverse :");
		a = input.nextInt();
		int temp = a;
		// Assigning the a = temp which we need to alocate the memory

		while (temp > 0) {
			// if the temp value is greater than zero the the loop getting executing

			/*
			 * the loop getting executing we need to reverse the integer to use % get the
			 * reminder to store in b
			 */

			b = temp % 10;
			// if we using the % we getting the reminder value of the digit
			temp = temp / 10;
			// if we using the / we getting the reminder value at atlast of the whole digit

			System.out.print(b);
		}

	}

}
