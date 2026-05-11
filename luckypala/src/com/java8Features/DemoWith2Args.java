package com.java8Features;

@FunctionalInterface
interface Interf4 {
	int multiplication(int a, int b);
}

public class DemoWith2Args {
	public static void main(String[] args) {

		Interf4 i4 = (a, b) -> {
			System.out.print("a * b = ");
			return a * b;
		};

//		Interf4 i4 = (a, b) -> a * b;

		System.out.println(i4.multiplication(10, 5));
		System.out.println(i4.multiplication(2, 5));
		System.out.println(i4.multiplication(8, 6));

	}
}
