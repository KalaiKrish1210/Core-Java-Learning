package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class IfFindGreaterLesserAndEqual {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Scanner method Syntax
		int a, b, c;
		System.out.println("enter the a value");
		a = sc.nextInt();
		System.out.println("enter the b value");
		b = sc.nextInt();
		System.out.println("enter the c value");
		c = sc.nextInt();

		// in this program we need finding the greater and lesser and also equal for
		// given inputs

		if ((a < b) && (a < c)) {
			System.out.println("a is small number");
		} else if ((b < a) && (b < c)) {
			System.out.println("b is small number");
		} else if ((c < a) && (c < b)) {
			System.out.println("c is small number");
		} else if ((a == b) && (a < c)) {
			System.out.println("a and b both numbers are same and it is smaller number ");
		} else if ((b == c) && (b < a)) {
			System.out.println("b and c both numbers are same and it is smaller number ");
		} else if ((a == b) && (a == c)) {
			System.out.println("All numbers are same");
		} else {
			System.out.println("Enter intergers only");
		}
	}
}
