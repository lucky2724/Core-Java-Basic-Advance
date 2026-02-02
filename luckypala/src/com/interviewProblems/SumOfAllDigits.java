package com.interviewProblems;

public class SumOfAllDigits {
	static int sod(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int n = 123;
		
		System.out.println(sod(n));
	}
}
