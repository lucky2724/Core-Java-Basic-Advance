package com.logicalstatements;

import java.util.Scanner;

//WAP to calculate addition subtraction multiplication division modulas based on the symbol
public class SwitchCaseDemo3 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first Number : ");
		int a = sc.nextInt();
		System.out.println("Enter a second Number : ");
		int b = sc.nextInt();

		System.out.println("Enter Operation Symbol (+,-,*,/,%) : ");
		String symb = sc.next();

		int result = 0;

		switch (symb) {
		case "+" -> result = a + b;
		case "-" -> result = a - b;
		case "*" -> result = a * b;
		case "/" -> result = a / b;
		case "%" -> result = a % b;
		default -> System.out.println("Invalid Symbol !!!");
		}

		System.out.println("Result : " + result);

		sc.close();

	}
}
