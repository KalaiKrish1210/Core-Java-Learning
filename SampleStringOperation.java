package com.kalai;

public class SampleStringOperation {
	public static void main(String[] agrs) {
		String a = "Kalai selvan";
		String b = "Krishnamoorthy";
		System.out.println(a.length());
		/*
		 * if we need to calculate the the length of the string we have to use the key
		 * word (.length)
		 */
		System.out.println(b.length());

		System.out.println(a.charAt(5));
		// if we need to find some letter from the string we have to use the key word
		// (.charAt)

		System.out.println(b.substring(0, 4));
		// if we need to assign some substring from the string we have to use the key
		// word(.substring)

		System.out.println(a.startsWith("Krish"));
		/*
		 * if we need to boolean function which means true or false from the string we
		 * have to use the key word (.startswith or .endswith)
		 */
		System.out.println(b.endsWith("moorthy"));

		System.out.println(a.indexOf(" "));
		/*
		 * if we need to access the string using index value from the string we have to
		 * use the key word(.indexOf)
		 */

		System.out.println(a.toUpperCase());
		/*
		 * if we need to change the string format from the string we have to use the key
		 * word (.toUppercase or .toLowercase)
		 */
		System.out.println(b.toLowerCase());

		System.out.println(a.concat(b));
		// if we need to merge two string we have to use the keyword(.concat)

	}
}
