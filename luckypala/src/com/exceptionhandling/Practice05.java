package com.exceptionhandling;

public class Practice05 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		try {
			System.out.println("in try");
			System.out.println(10 / 0);
		} catch (Exception e) {
			System.out.println("in Catch");
		} finally {
			try {
				System.out.println("inner try");
				System.out.println(10 / 0);
			} catch (ArithmeticException ar) {
				System.out.println("Catch the Exception");
			} finally {
				System.out.println("finally get it");
			}
		}
		
		System.out.println("**********************");

		int age = 16;

		if (age < 18) {
			throw new ArithmeticException("Not eligible to vote");
		}

		System.out.println("Eligible to vote");

	}
}
