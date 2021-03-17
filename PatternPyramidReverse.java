package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidReverse {

	public static void main(String[] args) {
		int row;
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Pyramid Value : ");
		row = input.nextInt();
		// Getting input value from user
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				// left side blank space
				System.out.print("  ");
			}

			for (int k = row; k >= i; k--) {
				// left side star
				System.out.print("* ");
			}
			for (int m = row - 1; m >= i; m--) {
				// right side star
				System.out.print("* ");
			}

			System.out.println("");
		}

	}

}
