package com.advancedConcepts;

interface Interf5 {
	int multiply(int a, int b);
}

public class Java8FeaturesDemo06 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf5 i5 = (a, b) -> {
			System.out.println("---------- Multiplication --------");
			return a * b;
		};

		Interf5 i6 = (a, b) -> a * b;

		System.out.println(i6.multiply(5, 25));
		System.out.println(i5.multiply(10, 34));
	}
}
