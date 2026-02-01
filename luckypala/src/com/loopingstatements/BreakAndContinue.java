package com.loopingstatements;

public class BreakAndContinue {
	public static void main(String[] args) {
		System.out.println("main method started..");

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "  ");
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.print(i + "  ");
		}

		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.print(i + "  ");
		}
	}
}
