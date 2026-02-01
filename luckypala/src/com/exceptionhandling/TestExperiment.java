package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExperiment {
	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		int a = 0;
		int b = 0;

		try {
			System.out.println("Enter a value : ");
			a = sc.nextInt();
			System.out.println("Enter b Value : ");
			b = sc.nextInt();
		} catch (InputMismatchException i) {
			System.err.println("in Catch InputMismatch Exception");
			System.err.println(i.getMessage());
		}

		try {
			System.out.println("in try");
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("in Catch Arithmetic Exception");
			System.err.println(e.getMessage());
		}

		System.out.println("main method ended");

		sc.close();
	}
}
