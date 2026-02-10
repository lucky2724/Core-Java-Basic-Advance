package com.advancedConcepts;

@FunctionalInterface
interface Interf4 {
	void method1(int a, int b);
}

//Not a functional interface
//interface Interf5 extends Interf4 {
//	void method2();
//}

public class Java8FeaturesDemo05 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Interf4 i4 = (a, b) -> System.out.println("Mul : " + a * b);
		i4.method1(10, 20);
		i4.method1(10, 100);

	}
}
