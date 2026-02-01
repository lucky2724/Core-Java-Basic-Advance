package com.tasks2ls;

public class ArmStrongNum {
	static boolean isArmstrong(int n) {
		int temp = n;
		int sum = 0;
		int digits = Integer.toString(n).length();

		while (n > 0) {
			int digit = n % 10;
			sum += Math.pow(digit, digits);
			n /= 10;
		}

		return temp == sum;
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		int n = 1634;

		if (isArmstrong(n)) {
			System.out.println(n + " is a Armstrong !!");
		} else {
			System.out.println(n + " is not a Armstrong !!");
		}
	}
}
