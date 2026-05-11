package com.java8Features;

@FunctionalInterface
interface Interf22 {
	void addition(int a, int b);
}

public class Java8Demo02 {
	public static void main(String[] args) {

		Interf22 i1 = (a, b) -> System.out.println("Sum of 2 Nums : " + (a + b));
		

		i1.addition(10, 20);

	}
}
