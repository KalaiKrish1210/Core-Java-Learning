package com.kalai;

public class PatternUsingWhileFlyodesStar {

	public static void main(String[] args) {
		int i = 1, j;
		while (i <= 5) {
			j = i;
			while (j <= 4) {
				System.out.print("* ");
				j++;
			}
			i++;
			System.out.println("");
			j = 1;
		}
	}

}
