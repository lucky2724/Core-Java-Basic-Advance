package com.exceptionhandling;

public class ArrayIndexOutOfBoundsExceptionDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = new int[3];

		try {
			System.out.println("in try");
			arr[0] = 10;
			arr[1] = 20;
			arr[4] = 50;
			arr[2] = 30;
			arr[3] = 40;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("in Catch");
			// e.printStackTrace();
			System.err.println(e.toString());
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("main method ended");
	}
}
