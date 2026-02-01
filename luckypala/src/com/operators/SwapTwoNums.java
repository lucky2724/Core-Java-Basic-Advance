package com.operators;

public class SwapTwoNums {
	public static void main(String[] args) {
		System.out.println("main method started..");
		// Swap two nums
		int a = 4;
		int b = 15;

		System.out.println("==== Before swap =====");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("==== After swap  =====");
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
