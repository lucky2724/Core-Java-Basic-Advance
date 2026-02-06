package com.strings;

public class StringMethods09 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("main method started");

		String s1 = "Srikanth";
		String s2 = "Srikanth";

		System.out.println(s1 == s2.intern());

		String s3 = "";
		String s4 = " ";
		String s5 = null;

		System.out.println("---------------------");

		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());

		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		System.out.println(s5.isEmpty());
		System.out.println(s5.isBlank());
	}
}
