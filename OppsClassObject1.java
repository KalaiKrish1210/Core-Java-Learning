package com.kalai;

import java.util.Scanner;
//Scanner method package importing

class Operator { 
// Class creating - " Class ' class name' "

	int num1; 
	int num2;
	int result;
	// Variable Declaration
	
	public void perform() {
	//Method creating - " public- Access modifier, void - return type, perform()- method name"
		
		result = num1 + num2;
		//performing the operation

	}

}

public class OppsClassObject1 {

	public static void main(String[] args) {
		
		Operator operator = new Operator();
		
		/*1.Operator - Class Name
		  2.operator - Object name
		  3.new - Keyword for memory allocation
		  4.Operator - Class name + ()*/
		
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the num1 value ");
		operator.num1 = input.nextInt();
		//Getting the first input value from user
		System.out.println("Enter the num2 value ");
		operator.num2 = input.nextInt();
		//Getting the second input from user
		operator.perform();
		// Call the method to perform the the operation
		System.out.println("The Addition of num1 and num2 is " + operator.result);

	}

}
