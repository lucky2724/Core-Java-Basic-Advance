package com.interviewProblems;

public class SwapTwoNums {
	public static void main(String[] args) {
		System.out.println("main method started");

		int a = 5;
		int b = 10;

		System.out.println("After swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
