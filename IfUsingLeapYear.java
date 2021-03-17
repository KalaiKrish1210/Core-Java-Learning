package com.kalai;

import java.util.Scanner;
//Scanner method package

public class IfUsingLeapYear {

	public static void main(String[] args) {
		int year;
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.print("Enter the year :");
		year = input.nextInt();
		// Getting the year value from user
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 4 == 0)) {

			/* we are using two logic operation "AND , OR " */

			System.out.print("This year is a leap year " + year);
		} else {
			System.out.println("This year is not a leap year" + year);
		}

	}

}
