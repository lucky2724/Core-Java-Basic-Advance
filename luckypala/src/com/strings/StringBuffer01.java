package com.strings;

public class StringBuffer01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		// String si Immutable Object
		String s = "Srikanth";
		s.concat("Java");
		System.out.println(s);

		// StringBuffer is Mutable Object
		System.out.println("----------------------");
		StringBuffer sb = new StringBuffer("Srikanth");
		sb.append(" Java");
		sb.append(10);
		sb.append(100.45);
		sb.append('A');
		System.out.println(sb);

	}
}
