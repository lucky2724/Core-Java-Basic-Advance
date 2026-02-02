package com.starpatterns;

public class Pattern01 {
	public static void main(String[] args) {
		System.out.println("main methid stated");
		int n = 6;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
