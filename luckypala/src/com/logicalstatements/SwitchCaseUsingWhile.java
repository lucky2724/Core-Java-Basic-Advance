package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseUsingWhile {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number :  ");
		int a = sc.nextInt();

		System.out.println("Enter your Second number : ");
		int b = sc.nextInt();

		int result = 0;
		String symb;

		do {
			System.out.println("Enter a symbol for operations like (+,-,*,/,%) : ");
			symb = sc.next();

			switch (symb) {
			case "+" -> result = a + b;
			case "-" -> result = a - b;
			case "*" -> result = a * b;
			case "/" -> result = a / b;
			case "%" -> result = a % b;
			default -> {
				System.out.println("!! Invalid Symbol !!  ");
				System.out.println("Please Try Again .....!!!");
				}
			}

		} while (!symb.equals("+") && !symb.equals("-") && !symb.equals("*") && !symb.equals("/") && !symb.equals("%"));

		System.out.println("Result : " + result);

		sc.close();

	}
}
