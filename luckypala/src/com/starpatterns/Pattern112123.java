package com.starpatterns;

public class Pattern112123 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int n = 6;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
