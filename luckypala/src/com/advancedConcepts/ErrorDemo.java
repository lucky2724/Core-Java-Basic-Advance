package com.advancedConcepts;

public class ErrorDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try ");
			int[] arr = new int[2147483647];
			System.out.println(arr);
		} catch (OutOfMemoryError er) {
			System.err.println("in catch");
			er.printStackTrace();
		} finally {
			System.out.println("in finaly");
		}

		System.out.println("main method ended");

		System.out.println("*************");
	}
}
