package com.kalai;

import java.util.Scanner;
//Scanner method importing

public class PattternPyramidLeftSide {

	public static void main(String[] args) {
		int row;
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the value : ");
		row = input.nextInt();
		// Getting the row value from the user

		// upper portion

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		// lower portion

		for (int a = 1; a <= row; a++) {
			for (int b = row - 1; b >= a; b--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
