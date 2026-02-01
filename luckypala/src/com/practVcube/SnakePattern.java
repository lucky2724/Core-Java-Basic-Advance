package com.practVcube;

public class SnakePattern {
	public static void main(String[] args) {
		System.out.println("main method started ...");

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j ++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
