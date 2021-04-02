package com.kalai;

import java.util.Scanner;

public class PatternPyramidZShape {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the row value :");
		int row = input.nextInt();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=row+3;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int a=1;a<=row;a++) {
			for(int b=row-1;b>=a;b--) {
				System.out.print("  ");
			}
			for(int c=1;c<=3;c++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=row+3;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
