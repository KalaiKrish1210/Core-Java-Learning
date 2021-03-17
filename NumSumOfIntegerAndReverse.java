package com.kalai;

import java.util.Scanner;
//Scanner method package importing

public class NumSumOfIntegerAndReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Value :");
		int a =input.nextInt();
		//Getting the input value from user 
		int temp1=a,b=0,c,sum=0,temp2;
		
		//Reverse
		while(temp1>0) {
			b=temp1%10;
			temp1=temp1/10;
			System.out.print(b);
		}
		
		//Sum
		temp2=a;
		while(temp2>0) {
			c=temp2%10;
			temp2=temp2/10;
			sum=sum+c;
			
		}
		
		System.out.println("\n"+sum);
	}

}
