package com.loopingstatements;

import java.util.Scanner;

public class FactorialOfNum {
	static long factorial(int n) {
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		long ans=factorial(n);
		System.out.println("Factorial of "+5+" is "+ ans);

		sc.close(); 
		
	}
}
