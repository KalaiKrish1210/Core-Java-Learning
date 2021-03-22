package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidNShape {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Row Value : ");
		int row = input.nextInt();
		// Getting the row from the user

		for (int i = 1; i <= row; i++) {
			// left side star
			for (int j = 1; j <= 2; j++) {
				System.out.print("* ");
			}
			// left side null value
			for (int k = 1; k <= i - 1; k++) {
				System.out.print("  ");
			}
			// middle line of star printing
			for (int l = 1; l <= 2; l++) {
				System.out.print("* ");
			}
			// right side null value
			for (int m = row - 1; m >= i; m--) {
				System.out.print("  ");
			}
			// right star printing
			for (int n = 1; n <= 2; n++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
