package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class NumSumOfDigitEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Value :");
		int a = input.nextInt();
		// Getting input value from user
		int temp1 = a, b, c = 0;
		while (temp1 > 0) {
			b = temp1 % 10;
			temp1 = temp1 / 10;
			if (b % 2 == 0) {
				c = c + b;

			}

		}
		System.out.println(c);
	}

}
