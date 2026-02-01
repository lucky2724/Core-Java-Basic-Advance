package com.exceptionhandling;

import java.util.Scanner;

public class ThrowDemo {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("main method started !!");

		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();

		if (b > 5) {
			System.out.println(a / b);
		} else {
			throw new ArithmeticException("Baabu Nanna Value Konchem Eakkuva ivvali!!");
		}

		System.out.println("main method eneded !!");

	}
}
