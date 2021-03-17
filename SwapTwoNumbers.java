package com.kalai;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[]args) {
		int temp,a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number :");
		a = input.nextInt();
		System.out.println("enter the second number :");
		b = input.nextInt();
		temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap the number a is :" + a);
		System.out.println("After swap the number b is :" + b);
	}

}
