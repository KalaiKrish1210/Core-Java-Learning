package com.kalai;

import java.util.Scanner;
//Scanner method package import

import java.util.Arrays;
//Array package import

public class ArrayGettingInputValueFromUser {

	public static void main(String[] args) {
		int a;
		int arr[] = new int[1000];
		// Array declaration and size too
		Scanner input = new Scanner(System.in);
		// Scanner syntax
		System.out.println("Enter the Array size do you want :");
		a = input.nextInt();
		// getting value from user how many array values we want
		System.out.println("enter the  Array values :");
		for (int i = 0; i < a; i++) {
			arr[i] = input.nextInt();
			// assigning index for the getted array values from user
		}
		for (int i = 0; i < a; i++) {
			System.out.print("a[" + i + "]=" + arr[i]);
			// print the getted array values
		}

	}

}
