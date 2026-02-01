package com.exceptionhandling;

public class Practice02 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
			String s1 = "Lucky";
			String s2 = null;
			String s3 = "null";

			System.out.println(s1.length());
			System.out.println(s3.length());
			System.out.println(s2.length());

		} catch (NullPointerException e) {
			System.out.println("in catch");
			// e.printStackTrace();
			System.err.println(e.toString());
			// System.err.println(e.getMessage());
		}

		System.out.println("main method ended");
	}
}
