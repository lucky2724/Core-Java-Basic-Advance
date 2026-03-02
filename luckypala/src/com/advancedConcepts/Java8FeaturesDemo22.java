package com.advancedConcepts;

public class Java8FeaturesDemo22 {

	// Var-arg
	static void addition(int... a) {

		int sum = 0;

		for (int a1 : a) {
			sum += a1;
		}

		System.out.println(sum);
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		addition(10);
		addition(10, 20);
		addition(10, 20, 30);
		addition(10, 20, 30, 40);
		addition(10, 20, 30, 40, 50);
		addition(10, 20, 30, 40, 50, 60);

	}
}
