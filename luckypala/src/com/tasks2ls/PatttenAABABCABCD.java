package com.tasks2ls;

public class PatttenAABABCABCD {
	public static void main(String[] args) {
		System.out.println("main metthod started...");

		int n = 5;

		for (int i = 65; i <= n+65-1; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}
}
