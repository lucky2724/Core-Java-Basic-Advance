package com.practVcube;

import java.util.Scanner;

public class ScannerP {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		int c = a + b;

		System.out.println("result : " + c);

		sc.close();

	}
}
