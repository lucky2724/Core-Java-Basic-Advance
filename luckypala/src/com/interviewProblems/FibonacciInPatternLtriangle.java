package com.interviewProblems;

public class FibonacciInPatternLtriangle {
	public static void main(String[] args) {
		int n = 5;

		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				int next = a + b;
				a = b;
				b = next;
			}
			System.out.println();
		}
	}

}
