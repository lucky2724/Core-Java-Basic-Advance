package com.operators;

public class BitWiseOperators3 {
	public static void main(String[] args) {
		System.out.println("main method started...");
		int a = 54;
		int b = 2;

		System.out.println("***** left-Shift ******");
		System.out.println(a << b); // 216
		System.out.println(76 << 3); // 608

		System.out.println("***** right-Shift ******");
		System.out.println(25 >> 2);// 6
		System.out.println(25 >>> 2);// 6
		System.out.println(65 >> 2);// 16

	}
}
