package com.java8Features;

@FunctionalInterface
interface Interf1 {
	void method1();
}

public class DemoWithNoArg {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf1 i1 = () -> {
			System.out.println("Hello Method 1");
		};

		i1.method1();
	}
}
