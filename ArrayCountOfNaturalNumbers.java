package com.kalai;

import java.util.Scanner;
//Scanner package import
import java.util.Arrays;
//Array package import

public class ArrayCountOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner syntax
		int arr[] = new int[999995];
		// Array declaration and size too
		int n = 0;
		/*
		 * in this program we are print a "n" number of natural number and finding the
		 * poisition of the element and sum of the "n" number of natural numbers
		 */
		for (int i = 0; i <= 99999; i++) {
			arr[i] = n;
			// we need to increament the "n" number of natural numbers that's why we need to
			// initalize and increament the value
			n++;
			System.out.println(arr[i]);
			// print the array values of natural numbers
		}
		int x;
		System.out.println(" which element do yuo want to find : ");
		x = input.nextInt();
		// getting the element from user for find the position of the element
		for (int i = 0; i <= 99999; i++) {
			if (x == arr[i]) {
				// if the users entered value is equal to the index i we have to print the
				// position value
				System.out.println("Position of " + x + "is " + i);
			}

		}
		int result = 0;
		// value intialized for calcualte the sum of the natural numbers
		for (int i = 0; i <= 99999; i++) {
			result = result + arr[i];
		}
		System.out.println(result);
	}

}
