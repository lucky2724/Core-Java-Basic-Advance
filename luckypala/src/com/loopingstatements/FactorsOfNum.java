package com.loopingstatements;

import java.util.Scanner;

//find factors of a num
//ex 6 -> 1,2,3,6
public class FactorsOfNum {
	public static void main(String[] args) {
		System.out.println("main method startedd !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println(n);

		sc.close();

	}
}
