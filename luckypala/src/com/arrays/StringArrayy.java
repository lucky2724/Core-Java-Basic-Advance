package com.arrays;

public class StringArrayy {
	public static void main(String[] args) {
		System.out.println("main method started..");

		String names[] = new String[4];

		names[0] = "Luckyy";
		names[1] = "Surya";
		names[2] = "Ashish";
		names[3] = "King";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
