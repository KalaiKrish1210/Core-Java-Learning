package com.kalai;

import java.util.Scanner;
//Scanner method Importing

public class PatternPyramidMShape {

	public static void main(String[] args) {
		int row;
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the value : ");
		row = input.nextInt();
		// Getting the row vale from user
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			// left side star

			for (int k = row - 1; k >= i; k--) {
				System.out.print("  ");
			}
			// left side null

			for (int a = row - 1; a >= i; a--) {
				System.out.print("  ");
			}
			// right side null

			for (int b = 1; b <= i; b++) {
				System.out.print("* ");
			}
			// right side star

			System.out.println("");
		}
	}

}
