package com.kalai;

import java.util.Scanner;
//Scanner method package

public class PatternPyramidKShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the row value: ");
		int row = input.nextInt();
		// getting the rows value from user

		/* upper portion */

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print("* ");
			}
			for (int k = row - 1; k >= i; k--) {
				System.out.print("  ");
			}
			for (int a = 1; a <= 2; a++) {
				System.out.print("* ");
			}
			for (int b = 1; b <= i - 2; b++) {
				System.out.print("  ");
			}
			System.out.println("");

		}

		// Middle portion

		for (int c = 1; c <= 2; c++) {
			for (int d = 1; d <= row + 3; d++) {
				System.out.print("* ");
			}
			System.out.println("");

		}

		// lower portion

		for (int x = 1; x <= row; x++) {
			for (int y = 1; y <= 2; y++) {
				System.out.print("* ");
			}
			for (int z = 1; z <= x - 1; z++) {
				System.out.print("  ");
			}
			for (int m = 1; m <= 2; m++) {
				System.out.print("* ");
			}
			System.out.println("");

		}
	}

}
