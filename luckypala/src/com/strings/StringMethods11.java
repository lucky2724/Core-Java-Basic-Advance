package com.strings;

public class StringMethods11 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String str1 = "Please Enter a details here";

		System.out.println(str1.substring(7));
		System.out.println(str1.substring(7, 12));

		CharSequence s1 = str1.subSequence(7, 12);
		System.out.println(s1);

		int a = 105;

		System.out.println(String.valueOf(a) + 40);
	}
}
