package com.advancedConcepts;

@FunctionalInterface
interface Intr1 {
	int method1(int a, int b);
}

public class Java8FeaturesDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		// Intr1 intf = (int a) -> System.out.println("Hello method1 -> " + (a));

		Intr1 intf = (int a, int b) -> a * b;

		System.out.println(intf.method1(10, 20));
		System.out.println(intf.method1(2, 10));
		System.out.println(intf.method1(12, 50));
	}
}
