package com.kalai;

import java.util.Scanner;
//Scanner method Package importing

public class IfUsingStudentGradeCaluculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		int mark;
		System.out.print("enter thr the marks :");
		mark = input.nextInt();
		//Getting the input value from user
		
		//Assigning a range depends upon the mark obtained in Subject
		if(mark<50) {
			System.out.println("Re-Appear");
		}
		else if((mark>=50)&&(mark<60)){
			System.out.println("Grade - C");
		}
		else if((mark>=60)&&(mark<70)){
			System.out.println("Grade - B");
		}
		else if((mark>=70)&&(mark<80)){
			System.out.println("Grade - A");
		}
		else if((mark>=80)&&(mark<90)){
			System.out.println("Grade - A++");
		}
		else if((mark>=90)&&(mark<=100)){
			System.out.println("Grade - O");
		}

	}

}
