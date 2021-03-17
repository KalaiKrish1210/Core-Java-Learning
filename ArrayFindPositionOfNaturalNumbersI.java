package com.kalai;

import java.util.Scanner;
//Scanner method package import

public class ArrayFindPositionOfNaturalNumbersI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		int a;
		int arr[] = new int[1000];
		// Array declaration and size too
		System.out.println("Enter how many arrays do you want:");
		a = input.nextInt();
		// getting value from user how many array values we want
		System.out.println("enter your array numbers:");
		for (int i = 0; i < a; i++) {

			arr[i] = input.nextInt();
			// assigning index for the getted array values from user
		}

		for (int i = 0; i < a; i++) {
			System.out.println(+arr[i]);// print the getted array values
		}
		int x;
		System.out.println(" which element do yuo want to find : ");
		x = input.nextInt();
		/*
		 * in this program we need to find the posotion of the array value thta's why we
		 * need to get the which element to want to find
		 */
		for (int i = 0; i < a; i++) {
			if (x == arr[i]) {
				System.out.println("Position of " + x + " is " + i);
			}
		}

	}

}
