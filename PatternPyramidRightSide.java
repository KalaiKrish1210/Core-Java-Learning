package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidRightSide {

	public static void main(String[] args) {
		int row;
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Pyramid Value : ");
		row = input.nextInt();
		// Getting row value from user

		// upper matrix
		for (int i = 1; i <= row; i++) {
			for (int j = row - 1; j >= i; j--) {
				// upper null values
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				// upper star values
				System.out.print("* ");
			}

			System.out.println("");
		}

		// lower matrix
		for (int a = 1; a <= row; a++) {
			for (int b = 1; b <= a; b++) {
				// lower null values
				System.out.print("  ");
			}

			for (int c = row - 1; c >= a; c--) {
				// lower star values
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
