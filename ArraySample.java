package com.kalai;

import java.util.Arrays;
//Array package importing

public class ArraySample {

	public static void main(String[] agrs) {
		int a[] = { 10, 11, 12, 13, 14, 15 };
		char b[] = { 'a', 'b', 'c', };
		System.out.println(Arrays.toString(a));
		/*
		 * if we need to use the array concept we have to import a array package (import
		 * java.util.Arrays)
		 */
		System.out.println(b);
		int len1 = a.length;
		int len2 = b.length;
		System.out.println(len1);
		// if we need to calculate the length of the array list we have to use the
		// keyword (.length)
		System.out.println(len2);
		int c[] = { 16, 17, 18, 19, 20 };
		a = c.clone();
		// if we need to copy some array values to one array to another array we have to
		// use the key word (.clone)
		System.out.println(Arrays.toString(a));
	}
}
