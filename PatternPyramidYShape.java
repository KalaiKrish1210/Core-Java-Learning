package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class PatternPyramidYShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Row Value :");
		int row = input.nextInt();
		//Getting the row from user
		
		//Upper portion
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				//Left Side 1 null value
				System.out.print("  ");
			}
			for(int k=1;k<=3;k++) {
				//Left side star value 
				System.out.print("* ");
			}
			for(int l=row-1;l>=i;l--) {
				//Left side 2 null value
				System.out.print("  ");
			}
			for(int m=row-1;m>=i;m--) {
				//Right side null value
				System.out.print("  ");
			}
			for(int n=1;n<=3;n++) {
				//Right side star value
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Lower Portion
		for(int a=1;a<=row;a++) {
			for(int b=row;b>=a;b--) {
				//Left side value
				System.out.print("  ");
			}
			for(int c=1;c<=5;c++) {
				//Both side of the star value Slanding
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	}

}
