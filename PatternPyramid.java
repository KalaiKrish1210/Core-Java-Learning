package com.kalai;

public class PatternPyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("P ");
			}

			for (int b = 2; b <= i; b++) {
				System.out.print("P ");

			}

			System.out.println("");
		}

	}

}
