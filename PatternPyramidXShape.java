package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidXShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Row value :");
		int row = input.nextInt();
		// Getting the row value from user
		
		//Upper portion
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				//Left side 1 null value
				System.out.print("  ");
			}
			for (int k = 1; k <= 3; k++) {
				//Left side star value
				System.out.print("* ");
			}
			for (int l = row - 1; l >= i; l--) {
				//Left side 2 null value
				System.out.print("  ");
			}
			for (int m = row - 1; m >= i; m--) {
				//Right side null value
				System.out.print("  ");
			}
			for (int n = 1; n <= 3; n++) {
				//Right side star value
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Lower portion
		
		for(int a=1;a<=row;a++) {
			for(int b=row;b>=a;b--) {
				//Left side 1 null value
				System.out.print("  ");
			}
			for (int c = 1; c <= 3; c++) {
				//Left side star value
				System.out.print("* ");
			}
			for (int d = 1; d <= a-1 ; d++) {
				//Left side 2 null value
				System.out.print("  ");
			}
			for (int e = 1; e <= a-1; e++) {
				//Right side null value 
				System.out.print("  ");
			}
			for (int f = 1; f <= 3; f++) {
				//Right side star value
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
