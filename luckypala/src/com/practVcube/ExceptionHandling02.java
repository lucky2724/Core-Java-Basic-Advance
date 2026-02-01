package com.practVcube;

import java.util.Scanner;

public class ExceptionHandling02 {
	public static void main(String[] args) {
		System.out.println("main method started..!!");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter your total marks : ");
			int marks = sc.nextInt();

			System.out.println("Enter how many subjects : ");
			int sub = sc.nextInt();

			System.out.println("Average marks per subject : " + marks / sub);
		} catch (ArithmeticException e) {
			System.out.println("Can not divisible by zero !!");
		} catch (java.util.InputMismatchException e) {
			System.out.println("Enter input in Numbers only ..!!");
		} finally {
			System.out.println("finally block always execute whether try and catch execute or not");
		}

		sc.close();
	}
}
