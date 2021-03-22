package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidTShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Row value :");
		int row = input.nextInt();
		// Getting row value from user
		
		// Upper portion T first line
		for (int i=1;i<=2;i++) {
			for (int j=1;j<=row;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		// Lower portion
		for (int k=1;k<=row-2;k++) {
			//left side null values
			
			//if the row value is even enter into the if statement 
			// why because the center position of the T line is print in the center
			if(row%2==0) {
				for (int l=1;l<=row/2-1;l++) {
					System.out.print("  ");
				}	
			}
			//if the row value is odd enter into the else statement
			// why because the center position of the T line is print in the center
			else {
				for (int l=1;l<=row/2-1;l++) {
					System.out.print("  ");
				}	
			}
			//center line of the T
			for (int m=1;m<=2;m++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
