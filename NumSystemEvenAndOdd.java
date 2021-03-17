package com.kalai;

import java.util.Scanner;
//Scanner method importing

public class NumSystemEvenAndOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the number from Start :");
		int a = input.nextInt();
		// Getting the input value from user
		int b = 0, c = 0, z = 0, q = 0;

		/*
		 * in this program the user entered value upto zero and find the even and also
		 * odd number upto user wanted range and get count of the even and also odd
		 * number in this program we finding anyone condition even and also odd
		 */

		for (int i = a; i >= 0; i--) {
			// we have to print the user entered value upto zero
			System.out.println(i);
			if (i % 2 == 0) {
				// even
				b = b + i;
				z++;

			}

			if (i % 2 != 0) {
				// odd
				c = c + i;
				q++;
			}

		}

		System.out.println("count of even numbers " + z);
		System.out.println("sum of even numbers " + b);
		System.out.println("Count of odd numbers " + q);
		System.out.println("sum of odd numbers " + c);

	}

}
