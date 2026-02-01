package com.patterns;

public class PatternABBCCC {
	public static void main(String[] args) {
		System.out.println("main method startd..");

		for (int i = 65; i <= 70; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) i+" ");
			}
			System.out.println();
		}
	}
}
