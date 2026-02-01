package com.tasks2ls;

public class ArmStrong2 {
	static int countDigits(int n) {
		int count = 0;

		while (n > 0) {
			n /= 10;
			count++;
		}

		return count;
	}

	static int pow(int n) {
		int len = countDigits(n);

		int pow = 1;
		for (int i = 1; i <= len; i++) {
			pow *= n;
		}

		return pow;
	}

	static boolean isArmstrong(int n) {
		int temp = n;
		int digits = countDigits(n);
		int sum = 0;

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, digits);
			n /= 10;
		}

		return temp == sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int n = 678;

		if (isArmstrong(n)) {
			System.out.println(n + " is Armstrong !!");
		} else {
			System.out.println(n + " is not an armStrong !!");
		}
	}

}
