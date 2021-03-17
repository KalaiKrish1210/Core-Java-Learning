package com.kalai;

import java.util.Scanner;
//Scanner package importing

public class ArrayFindingtheElement {

	public static void main(String[] args) {
		int a;
		int arr[] = new int[1000];
		// Declaration of array and the size of the array too
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Array size do you want :");
		a = input.nextInt();
		// Getting the size of the array from user
		System.out.println("enter the  Array values :");
		for (int i = 0; i < a; i++) {
			arr[i] = input.nextInt();
			// Assigning the index of the array values
		}
		for (int i = 0; i < a; i++) {
			System.out.print("{" + arr[i] + "},");
			// print the array values
		}
		int b;
		System.out.println("\nEnter the element do you want to find :");
		b = input.nextInt();
		// getting the value which element's position we need to find
		for (int i = 0; i < a; i++) {
			if (b == arr[i]) {
				System.out.println("The position of the element " + b + " is a[" + i + "]");
			}
		}
	}

}
