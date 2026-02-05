package com.strings;

public class StringMethods06 {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringMethods06 st1 = new StringMethods06();
		StringMethods06 st2 = new StringMethods06();

		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		System.out.println(st1 == st2);
		System.out.println(st1.equals(st2));

		System.out.println("--------------------");

//		String s1 = "Java";
//		String s2 = "Java";

		String s1 = new String("Java");
		String s2 = new String("Java");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		if (s1 == s2) {
			System.out.println("Both are Same !!");
		} else {
			System.out.println("Both are not Same !!");
		}

		if (s1.equals(s2)) {
			System.out.println("Both are Same !!");
		} else {
			System.out.println("Both are not Same !!");
		}
	}
}
