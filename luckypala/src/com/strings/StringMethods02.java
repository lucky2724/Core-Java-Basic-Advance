package com.strings;

public class StringMethods02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "Java";

		// CodePointAt
		System.out.println(s.codePointAt(1));// 97
		System.out.println(s.codePointBefore(1));// 74
		System.out.println(s.codePointCount(0, 2));// 2

		System.out.println("------------------------------");

		// CompareTo & CompareToIgnoreCase
		String s1 = "Advaith";
		String s2 = "Abhigna";

		System.out.println(s1.compareTo(s2));

		String str1 = "A";
		String str2 = "a";

		System.out.println(str1.compareTo(str2));

		String s3 = "Abhiram";
		String s4 = "abhiram";

		System.out.println(s3.compareToIgnoreCase(s4));

		String s5 = "sai ram ";
		String s6 = "sai ram java";

		System.out.println(s5.compareTo(s6));
	}
}
