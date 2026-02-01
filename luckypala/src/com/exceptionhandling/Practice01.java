package com.exceptionhandling;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		System.out.println("main method stated..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Value :");
		int a = sc.nextInt();

		System.out.println("Enter b Value : ");
		int b = sc.nextInt();

		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (Exception e) {
			System.err.println("Catch the error!!");
			//e.printStackTrace();
			e.toString();
		}

		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");
		System.out.println("main method ended");

		sc.close();

	}
}
