package com.kalai;

import java.util.Scanner;
//Scanner method Package importing 

class PatternV {
	// Class Decalaration
	int row;

	public void Perform() {
		// Method Declartion

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				// Left Side 1 null values
				System.out.print("  ");
			}
			for (int k = 1; k <= 3; k++) {
				// Left Side Star Values
				System.out.print("* ");
			}
			for (int l = row - 1; l >= i; l--) {
				// Left side 2 null values
				System.out.print("  ");
			}
			for (int n = row - 1; n >= i; n--) {
				// Right side 1 null values
				System.out.print("  ");
			}
			for (int m = 1; m <= 3; m++) {
				// Right side Star values
				System.out.print("* ");
			}
			System.out.println("");
		}

	}
}

public class PatternPyramidVShape {
	// Main class

	public static void main(String[] args) {
		PatternV obj = new PatternV();
		// Object creation for the class
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the Row Value :");
		obj.row = input.nextInt();
		// Getting the row from user
		obj.Perform();
		// Call the method to perform the operation

	}

}
