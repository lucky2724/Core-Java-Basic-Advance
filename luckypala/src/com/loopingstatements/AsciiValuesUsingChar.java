package com.loopingstatements;

public class AsciiValuesUsingChar {
	public static void main(String[] args) {
		System.out.println("main mthods started");

		System.out.println("Ascii Values Of A-Z");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " -> " + (int) ch + "   ");
		}

		System.out.println();
		System.out.println("Ascii Values Of a-z");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " -> " + (int) ch + "   ");
		}
	}
}
