package com.kalai;

import java.util.Scanner;
//Scanner method package importing 

public class PatternPyramidWShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Row Value :");
		int row = input.nextInt();
		// Getting the input row value from user
		for (int i=1;i<=row;i++) {
			for(int j=1;j<=2;j++) {
				// Right side 1 star value
				System.out.print("* ");
			}
			for(int k=row-1;k>=i;k--) {
				// Right side 1 null value
				System.out.print("  ");
			}
			for(int l=1;l<=2;l++) {
				//Right side 2 star value 
				System.out.print("* ");
			}
			for(int m=1;m<=i-1;m++) {
				// Right side 2 null value
				System.out.print("  ");
			}
			for(int n=1;n<=i-1;n++) {
				// Left side 1 null value 
				System.out.print("  ");
			}
			for(int o=1;o<=2;o++) {
				// Left side 1 star value
				System.out.print("* ");
			}
			for(int p=row-1;p>=i;p--) {
				// Left side 2 null value
				System.out.print("  ");
			}
			for(int q=1;q<=2;q++) {
				// Left side 2 star value
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
