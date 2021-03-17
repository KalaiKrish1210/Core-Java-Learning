package com.kalai;

import java.util.Scanner;
//if we get the input values from user we have to import the package

public class SampleInputValueGet {
	public static void main(String[] args) {
		String a;
		Scanner input = new Scanner(System.in);

		/*
		 * Scanner method declaration: "Scanner"-Keyword,"sc"-variable declaration,
		 * "new"-allocate a memory for the Scanner method, "Scanner(System.in)"-keyword.
		 */

		System.out.println("enter the Name");
		a = input.nextLine();
		/*
		 * input data call: "a"- variable of data type call, "sc"-Variable of Scanner
		 * method call, ".next'...datatype..'"-Scanner call data type.
		 */
		System.out.println("the name is :" + a);
	}

}
