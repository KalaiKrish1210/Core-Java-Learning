package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class SwitchCaseUsingOperators {

	public static void main(String[] args) {
		int a, b, c, x;
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Divide");
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Choose the operation :");
		x = input.nextInt();
		// Getting the value from user
		switch (x) {

		// Addition
		case 1:
			System.out.print("enter the first value :");
			a = input.nextInt();
			System.out.print("enter the second value :");
			b = input.nextInt();
			c = a + b;
			System.out.println("The Result is :" + c);
			break;

		// Subration
		case 2:
			System.out.print("enter the first value :");
			a = input.nextInt();
			System.out.print("enter the second value :");
			b = input.nextInt();
			c = a - b;
			System.out.println("The Result is :" + c);
			break;

		// Multiplication
		case 3:
			System.out.print("enter the first value :");
			a = input.nextInt();
			System.out.print("enter the second value :");
			b = input.nextInt();
			c = a * b;
			System.out.println("The Result is :" + c);
			break;

		// Divide
		case 4:
			System.out.print("enter the first value :");
			a = input.nextInt();
			System.out.print("enter the second value :");
			b = input.nextInt();
			c = a / b;
			System.out.println("The Result is :" + c);
			break;

		}

	}

}
