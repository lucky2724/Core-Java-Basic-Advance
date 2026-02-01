package com.loopingstatements;

public class ForLoop1to100 {
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		// 100 - 0
		for (int i = 100; i >= 0; i--) {
			System.out.print(i + " ");
		}
	}
}
