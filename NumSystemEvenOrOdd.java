package com.kalai;

import java.util.Scanner;
//Scanner method importing

public class NumSystemEvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the number from Start :");
		int a = input.nextInt();
		// Getting the input value from user
		int b = 0, c = 0, z = 0, q = 0;
		for (int i = a; i >= 0; i--) {
			// we have to print the user entered value upto zero

			/*
			 * in this program the user entered value upto zero and find the even or odd
			 * number upto user wanted range and get count of the even or odd number in this
			 * program we finding anyone condition even or odd
			 */

			if (a % 2 == 0) {
				if (i % 2 == 0) {
					// even
					System.out.println(i);
					b = b + i;
					z++;

				}

			}

			else {
				if (i % 2 != 0) {
					// odd
					System.out.println(i);
					c = c + i;
					q++;
				}
			}
		}
		// printing statement
		if (a % 2 == 0) {
			System.out.println("count of even " + z);
			System.out.println("sum of even " + b);
		} else {
			System.out.println("Count of odd " + q);
			System.out.println("sum of odd " + c);

		}

	}
}
