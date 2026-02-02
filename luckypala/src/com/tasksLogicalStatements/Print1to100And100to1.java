package com.tasksLogicalStatements;

public class Print1to100And100to1 {
	public static void main(String[] args) {
		System.out.println("main method started...");
		// print 1-100
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();

		// print 100-1
		for (int i = 100; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println();
		
		// even nums from 1-100
		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
		}
	}
}
