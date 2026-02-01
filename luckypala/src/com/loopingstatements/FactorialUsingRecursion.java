package com.loopingstatements;

public class FactorialUsingRecursion {
	static long factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		int n = 5;

		System.out.println(factorial(n));
	}
}
