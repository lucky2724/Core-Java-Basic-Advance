package com.advancedConcepts;

@FunctionalInterface
interface Interf7 {
	String method1(String s1, String s2);
}

public class Java8FeaturesDemo08 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf7 i7 = (s1, s2) -> s1.concat(s2);
		System.out.println(i7.method1("Java", " Srikanth"));
	}
}
