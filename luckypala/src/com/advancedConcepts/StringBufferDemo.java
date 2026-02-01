package com.advancedConcepts;

public class StringBufferDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		StringBuffer sb1 = new StringBuffer();

		System.out.println(sb1.length());
		System.out.println(sb1.capacity());

		System.out.println(sb1);
		System.out.println("Hello");

		System.out.println("********");
		StringBuffer sb2 = new StringBuffer("Java");

		System.out.println(sb2.length());
		System.out.println(sb2.capacity());// 20
		System.out.println(sb2);

		System.out.println("********");
		StringBuffer sb3 = new StringBuffer();

		sb3.append("JavaJavaJavaJavaJavaJavaJavaJava");
		sb3.append("Hello Java");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());// 20
		System.out.println(sb3);
	}
}
