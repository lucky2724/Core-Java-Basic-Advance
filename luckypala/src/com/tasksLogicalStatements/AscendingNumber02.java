package com.tasksLogicalStatements;

public class AscendingNumber02 {
	public static void main(String[] args) {
		int n = 87652379;

		int ans = 0;

		for (int i = 0; i <= 9; i++) {
			int temp = n;
			while (temp > 0) {
				int rem = temp % 10;
				if (rem == i) {
					ans = ans * 10 + rem;
				}
				temp /= 10;
			}
		}

		System.out.println("Input  : "+n);
		System.out.println("OutPut : "+ans);
	}
}
