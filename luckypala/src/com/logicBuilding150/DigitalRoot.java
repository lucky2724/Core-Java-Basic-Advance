package com.logicBuilding150;

public class DigitalRoot {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int n = 9872;

		while (n >= 10) {
			int ans = 0;
			while (n > 0) {
				ans += n % 10;
				n /= 10;
			}
			n = ans;
		}

		System.out.println(n);

	}
}
