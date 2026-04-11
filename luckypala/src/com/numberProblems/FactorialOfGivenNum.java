package com.numberProblems;

public class FactorialOfGivenNum {
	static long factorial(int n) {
		long fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 7;
		
		System.out.println(factorial(n));
	}
}
