package com.tasksExceptions;

public class Methods_3_Exceptions {
	static void method1() {
		System.out.println("method 1 Started");
		try {
			method2();
		} finally {
			System.out.println("method1 finally");
		}
	}

	static void method2() {
		System.out.println("method 2 Started");
		try {
			method3();
		} finally {
			System.out.println("method2 finally");
		}
	}

	static void method3() {
		System.out.println("method 3 Started");
		try {
			System.out.println(10 / 0);
		} finally {
			System.out.println("method3 finally");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			method1();
		} catch (ArithmeticException ar) {
			System.err.println("in Catch");
			ar.printStackTrace();
		}

		System.out.println("main method ended");

	}
}
