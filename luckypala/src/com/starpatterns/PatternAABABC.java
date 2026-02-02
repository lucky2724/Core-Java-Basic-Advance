package com.starpatterns;

public class PatternAABABC {
	public static void main(String[] args) {
		System.out.println("main method started..");

		for (int i = 65; i <= 70; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j + " ");
			}
			System.out.println();
		}
	}
}
