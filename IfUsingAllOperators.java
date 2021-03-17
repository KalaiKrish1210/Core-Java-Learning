package com.kalai;

import java.util.Scanner;
//Scanner method pacakage importing

public class IfUsingAllOperators {

	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("1.Addiion");
		System.out.println("2.Subration");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("5.Modulo");
		System.out.println("6.Increment");
		System.out.println("7.Decreament");
		System.out.println("8.comparison");
		System.out.println("9.Greater or Lesser");
		System.out.println("Choose any one");
		int c = sc.nextInt();
		int a, b, d;
		// Addition
		if (1 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			d = a + b;
			System.out.println("the addition value of a and b is " + d);
		}
		// Subration
		else if (2 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			d = a - b;
			System.out.println("the Subration value of a and b is " + d);
		}
		// Multiplication
		else if (3 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			d = a * b;
			System.out.println("the Multiplication value of a and b is " + d);
		}
		// Divide
		else if (4 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			d = a / b;
			System.out.println("the Division value of a and b is " + d);
		}
		// Modulo Division
		else if (5 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			d = a % b;
			System.out.println("the Modulus value of a and b is " + d);
		}
		// Increament
		else if (6 == c) {
			System.out.println("enter the Increament value");
			a = sc.nextInt();
			d = ++a;
			System.out.println("the increament value is " + d);

		}
		// Decreament
		else if (7 == c) {
			System.out.println("enter the Decreament value");
			a = sc.nextInt();
			d = --a;
			System.out.println("the Decreament value is " + d);

		}
		// Comparison
		else if (8 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			if (a == b) {
				System.out.println("the numbers are equal");
			} else {
				System.out.println("the numbers are not equal");
			}

		}
		// Greater than or Less than
		else if (9 == c) {
			System.out.println("enter the a value");
			a = sc.nextInt();
			System.out.println("enter the b value");
			b = sc.nextInt();
			if (a > b) {
				System.out.println("the numbers are a is greater than b");
			} else if (a == b) {
				System.out.println("the numbers are equal");
			} else if (a < b) {
				System.out.println("the numbers are a is lesser than b");
			}

		} else {
			System.out.println("choose the correct operation");
		}

	}
}