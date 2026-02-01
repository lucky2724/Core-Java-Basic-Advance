package com.arrays;

public class Arrays2D_04Strings {
	public static void main(String[] args) {
		System.out.println("main method started..");

		String[][] names = { { "kohli", "Rohit", "Jaiswal", "KL" }, { "Gaikward", "Washington", "Jadeja" },
				{ "Harshith Rana", "Arshdeep", "Kuldeep", "prashidh" } };

		for (String n[] : names) {
			for (String order : n) {
				System.out.print(order + " | ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
