package com.Problems;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int n = 153;
		int temp = n;

		int digits = Integer.toString(n).length();
		int ans = 0;

		while (n > 0) {
			int digit = n % 10;
			ans += Math.pow(digit, digits);
			n /= 10;
		}

		System.out.println(ans);

		if (temp == ans) {
			System.out.println(temp + " is Armstrong Number  !!");
		} else {
			System.out.println(temp + " is not Armstrong Number !!");
		}
	}
}
