package com.tasks2ls;

public class AtoZ {
	public static void main(String[] args) {
		System.out.println("main method started !!");

		System.out.println("Upper Case Letters (A-Z)");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}

		System.out.println();
		System.out.println("Upper Case Letters (a-z)");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch + " ");
		}

		System.out.println();
		System.out.println("Alphabets with Numbers A-1,B-2...");
		int l = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " -> " + ++l);
		}
	}
}
