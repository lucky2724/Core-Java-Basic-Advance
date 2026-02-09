package com.strings;

public class StringMethods10 {
	public static void main(String[] args) {
		System.out.println("main method started");

		// Join()
		String s = String.join("-->", "Hello", "Good", "Morning", "Bye", "Apple");

		System.out.println(s);

		System.out.println("-------------------");
		// split()
		String s1 = "    Java is simple in     Vcube at JNTU Hyderabad";

		int count=0;
		String[] arr = s1.trim().split("\\s+",5);

		for (String name : arr) {
			System.out.println(name);
			count++;
		}
		System.out.println(count);

	}
}
