package com.tasks2ls;

public class MagicNumber {
	static boolean isMagicalNum(int n) {
		if(n<0) {
			System.out.println("Invalid !!");
		}
		while (n >= 10) {
			int ans = 0;
			while (n > 0) {
				int digit = n % 10;
				ans += digit;
				n /= 10;
			}
			n = ans;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		System.out.println("main mrthod started..");

		int n = -1729;

		if (isMagicalNum(n)) {
			System.out.println(n + " is a Magical Number !!");
		} else {
			System.out.println(n + " is not a Magical Number !!");
		}

	}
}
