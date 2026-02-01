package com.exceptionhandling;

public class LStringIndexOutOfBoundsExceptionDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		String str = "Srikanth";

		try {
			System.out.println("in try");
			System.out.println(str.charAt(4));
			System.out.println(str.charAt(9));
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("in Catch");
			System.err.println(e.toString());
			// e.printStackTrace();
		}

	}
}
