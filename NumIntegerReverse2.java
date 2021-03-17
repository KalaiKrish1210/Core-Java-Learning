package com.kalai;

import java.util.Scanner;
//Scanner method package

public class NumIntegerReverse2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the Value :");
		int a = input.nextInt();
		int rem = 0, sum = 0, v = 0;

		while (a > 0) {

			// if the temp value is greater than zero the the loop getting executing

			/*
			 * the loop getting executing we need to reverse the integer to use % get the
			 * reminder to store in b
			 */

			rem = a % 10;
			sum = (sum * 10) + rem;
			/*
			 * in this method of reverse integer means we have advantage and also
			 * disadvantage why because Advantage and disadvantage : is if we need to
			 * negotitate zero value in first ex : 7890=987
			 */
			a = a / 10;

		}
		System.out.print(sum);

	}

}
