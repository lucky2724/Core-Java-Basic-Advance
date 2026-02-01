package com.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Value : ");
		int a = sc.nextInt();

		System.out.println("Enter b Value : ");
		int b = sc.nextInt();

		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (Throwable e) {
			System.err.println("in Catch");
			// e.printStackTrace();
			// System.err.println(e.getMessage());
			System.err.println(e.toString());
		}

//		try {
//			System.out.println(0 / 0);
//		} catch (Exception e) {
//			System.out.println("in catch");
//			e.printStackTrace();
//		}

		System.out.println("main method ended !!!");

		sc.close();
	}
}
