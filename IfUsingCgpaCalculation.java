package com.kalai;

import java.util.Scanner;
//Scanner package importing

public class IfUsingCgpaCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Scanner syntax
		float sub1, sub2, sub3, sub4, sub5, sub6, creditpoints, cp1 = 0, cp2 = 0, cp3 = 0, cp4 = 0, cp5 = 0, cp6 = 0;

		// Getting a input value from user which means the marks obtained in each
		// subjects

		System.out.print("enter the Subject-1 marks :");
		sub1 = input.nextFloat();
		System.out.print("enter the Subject-2 marks :");
		sub2 = input.nextFloat();
		System.out.print("enter the Subject-3 marks :");
		sub3 = input.nextFloat();
		System.out.print("enter the Subject-4 marks :");
		sub4 = input.nextFloat();
		System.out.print("enter the Subject-5 marks :");
		sub5 = input.nextFloat();
		System.out.print("enter the Subject-6 marks :");
		sub6 = input.nextFloat();

		// Assigning a value of credit points range to calculate depends on the mark
		// obtained in each subjects

		if (sub1 < 50) {
			System.out.println("Re-Appear");
			cp1 = 0;
		} else if ((sub1 >= 50) && (sub1 < 60)) {
			System.out.println("Grade - C");
			cp1 = 6;
		} else if ((sub1 >= 60) && (sub1 < 70)) {
			System.out.println("Grade - B");
			cp1 = 7;
		} else if ((sub1 >= 70) && (sub1 < 80)) {
			System.out.println("Grade - A");
			cp1 = 8;
		} else if ((sub1 >= 80) && (sub1 < 90)) {
			System.out.println("Grade - A++");
			cp1 = 9;
		} else if ((sub1 >= 90) && (sub1 <= 100)) {
			System.out.println("Grade - O");
			cp1 = 10;
		}
		if (sub2 < 50) {
			System.out.println("Re-Appear");
			cp2 = 0;
		} else if ((sub2 >= 50) && (sub2 < 60)) {
			System.out.println("Grade - C");
			cp2 = 6;
		} else if ((sub2 >= 60) && (sub2 < 70)) {
			System.out.println("Grade - B");
			cp2 = 7;
		} else if ((sub2 >= 70) && (sub2 < 80)) {
			System.out.println("Grade - A");
			cp2 = 8;
		} else if ((sub2 >= 80) && (sub2 < 90)) {
			System.out.println("Grade - A++");
			cp2 = 9;
		} else if ((sub2 >= 90) && (sub2 <= 100)) {
			System.out.println("Grade - O");
			cp2 = 10;
		}
		if (sub3 < 50) {
			System.out.println("Re-Appear");
			cp3 = 0;
		} else if ((sub3 >= 50) && (sub3 < 60)) {
			System.out.println("Grade - C");
			cp3 = 6;
		} else if ((sub3 >= 60) && (sub3 < 70)) {
			System.out.println("Grade - B");
			cp3 = 7;
		} else if ((sub3 >= 70) && (sub3 < 80)) {
			System.out.println("Grade - A");
			cp3 = 8;
		} else if ((sub3 >= 80) && (sub3 < 90)) {
			System.out.println("Grade - A++");
			cp3 = 9;
		} else if ((sub3 >= 90) && (sub3 <= 100)) {
			System.out.println("Grade - O");
			cp3 = 10;
		}
		if (sub4 < 50) {
			System.out.println("Re-Appear");
			cp4 = 0;
		} else if ((sub4 >= 50) && (sub4 < 60)) {
			System.out.println("Grade - C");
			cp4 = 6;
		} else if ((sub4 >= 60) && (sub4 < 70)) {
			System.out.println("Grade - B");
			cp4 = 7;
		} else if ((sub4 >= 70) && (sub4 < 80)) {
			System.out.println("Grade - A");
			cp4 = 8;
		} else if ((sub4 >= 80) && (sub4 < 90)) {
			System.out.println("Grade - A++");
			cp4 = 9;
		} else if ((sub4 >= 90) && (sub4 <= 100)) {
			System.out.println("Grade - O");
			cp4 = 10;
		}
		if (sub5 < 50) {
			System.out.println("Re-Appear");
			cp5 = 0;
		} else if ((sub5 >= 50) && (sub5 < 60)) {
			System.out.println("Grade - C");
			cp5 = 6;
		} else if ((sub5 >= 60) && (sub5 < 70)) {
			System.out.println("Grade - B");
			cp5 = 7;
		} else if ((sub5 >= 70) && (sub5 < 80)) {
			System.out.println("Grade - A");
			cp5 = 8;
		} else if ((sub5 >= 80) && (sub5 < 90)) {
			System.out.println("Grade - A++");
			cp5 = 9;
		} else if ((sub5 >= 90) && (sub5 <= 100)) {
			System.out.println("Grade - O");
			cp5 = 10;
		}
		if (sub6 < 50) {
			System.out.println("Re-Appear");
			cp6 = 0;
		} else if ((sub6 >= 50) && (sub6 < 60)) {
			System.out.println("Grade - C");
			cp6 = 6;
		} else if ((sub6 >= 60) && (sub6 < 70)) {
			System.out.println("Grade - B");
			cp6 = 7;
		} else if ((sub6 >= 70) && (sub6 < 80)) {
			System.out.println("Grade - A");
			cp6 = 8;
		} else if ((sub6 >= 80) && (sub6 < 90)) {
			System.out.println("Grade - A++");
			cp6 = 9;
		} else if ((sub6 >= 90) && (sub6 <= 100)) {
			System.out.println("Grade - O");
			cp6 = 10;
		}
		float sumOfCreditPoints = cp1 + cp2 + cp3 + cp4 + cp5 + cp6;
		System.out.print("The credit points are :" + sumOfCreditPoints);
		float CGPA = sumOfCreditPoints / 6;
		System.out.println("\nThe CGPA is :" + CGPA);
	}

}
