package com.tasksarrays;

public class DhoniPattern {
	public static void main(String[] args) {
		System.out.println("main method started");

		String s = "SIRISHA";

		int n = s.length();

		char ch = 'a';

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(s.charAt(i) + "  ");
				} else {
					if (ch == 'z' + 1) {
						ch = 'a';
					}
					System.out.print(ch + "  ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
