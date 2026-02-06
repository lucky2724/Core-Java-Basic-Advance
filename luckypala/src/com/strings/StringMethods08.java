package com.strings;

public class StringMethods08 {
	public static void main(String[] args) {
		System.out.println("main method startedF");

		String str = "Java is Simple in Vcube Software solutions";

		// indexOf()
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));

		int n = 3;

		int index = -1;

		for (int i = 0; i < n; i++) {
			index = str.indexOf('a', index + 1);
		}

		if (index == -1) {
			System.out.println(n + " th pos char is not available");
		} else {
			System.out.println(index);
		}

		// lastIndexOf()
		System.out.println(str.lastIndexOf('a'));

		// indexOf also work in string
		System.out.println(str.indexOf("in"));
		System.out.println(str.lastIndexOf("so"));

		// indent()
		System.out.println(str.indent(10)); // spaces
	}
}
