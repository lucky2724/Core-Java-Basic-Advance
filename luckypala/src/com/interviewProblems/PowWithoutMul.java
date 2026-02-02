package com.interviewProblems;

public class PowWithoutMul {
	static int multiply(int a, int b) {
		int result = 0;

		for (int i = 0; i < b; i++) {
			result += a;
		}

		return result;
	}

	static int power(int base, int exp) {
		int result = 1;

		for (int i = 0; i < exp; i++) {
			result = multiply(result, base);
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int base = 2;
		int exp = 5;

		System.out.println(power(base, exp));
	}
}
