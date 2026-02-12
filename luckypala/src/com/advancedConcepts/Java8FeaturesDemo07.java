package com.advancedConcepts;

@FunctionalInterface
interface Interf6 {
	int sqrt(int a);
}

public class Java8FeaturesDemo07 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf6 i6 = n -> n * n;
		System.out.println(i6.sqrt(6));
		System.out.println(i6.sqrt(15));
	}
}
