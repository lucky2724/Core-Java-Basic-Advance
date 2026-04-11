package com.numberProblems;

public class CountAllDigits {
	static int countDigits(int n) {
		if (n == 0) {
			return 1;
		}

		int count = 0;

		while (n > 0) {
			n /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		int n = 71845;
		int n1 = 973;

		int ans = countDigits(n);
		System.out.println(n + " ==> " + ans);

		int ans2 = countDigits(n1);
		System.out.println(n1 + " ==> " + ans2);
	}
}
