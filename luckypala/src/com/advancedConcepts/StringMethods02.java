package com.advancedConcepts;

public class StringMethods02 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		String s = "Java is Simple in Vcube a";

		System.out.println(s.indexOf('v'));

		System.out.println(s.indexOf("in"));

		System.out.println(s.indexOf('a', 2));

		System.out.println();

		String s1 = "Java";
		String s2 = "Java";

		String s3 = new String("Java");
		String s4 = new String("Java");

		s3 = s3.intern();

		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s2 == s3);

		System.out.println("**********");

		@SuppressWarnings("unused")
		String s5 = null;
		String s6 = "";
		String s7 = " ";

		//System.out.println(s5.isEmpty()); // Null pointer Exception
		System.out.println(s6.isEmpty());// true
		System.out.println(s7.isEmpty());// false
		
		System.out.println(s7.isBlank());
		System.out.println(s6.isBlank());

	}
}
