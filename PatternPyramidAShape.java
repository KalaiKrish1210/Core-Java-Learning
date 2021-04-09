package com.kalai;

import java.util.Scanner;
//Scanner method Package importing

class PatternA{
	//Class Declaration
	int row;
	public void Perfom(){
		//Method Declaration
		
		//Upper Portion
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				//Left side 1 null values 
				System.out.print("  ");
			}
			for(int k=1;k<=3;k++) {
				//Left side Star values 
				System.out.print("* ");
			}
			for(int l=1;l<=i-1;l++) {
				//Left side 2 null values 
				System.out.print("  ");
			}
			for(int m=1;m<=i-1;m++) {
				//Right side 1 null values 
				System.out.print("  ");
			}
			for(int n=1;n<=3;n++) {
				//Right Side Star Values 
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Middle Portion
		for(int x=1;x<=3;x++) {
			for(int y=1;y<=row+row+6;y++) {
				//Middle Star value
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Lower Portion
		for(int a=1;a<=row;a++) {
			for(int b=1;b<=3;b++) {
				//Left side Star values 
				System.out.print("* ");
			}
			for(int c=1;c<=row+row;c++) {
				//Center Null values
				System.out.print("  ");
			}
			for(int d=1;d<=3;d++) {
				//Right Side values
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

public class PatternPyramidAShape {
	//Main class

	public static void main(String[] args) {
		PatternA obj = new PatternA();
		//Object Creation for the class
		Scanner input = new Scanner(System.in);
		//Scanner method Syntax
		System.out.println("Enter the Row Value : ");
		obj.row = input.nextInt();
		//Getting a row value from user
		obj.Perfom();
		//Call the method to perform the operation

	}

}
