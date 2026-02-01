package com.exceptionhandling;

public class NullPointerExcetionDemo {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("main method started");

		String s1 = "Srikanth";
		String s2 = null;
		String s3 = "null";

		try {
			System.out.println("In try");
			System.out.println(s1.length());// 8
			System.out.println(s2.length());// NPE
			System.out.println(s3.length());// Once exception comes it jumps into catch bloclk so it will be not printed
		} catch (NullPointerException e) {
			System.err.println("In Catch");
			// e.printStackTrace();
			System.err.println("Message and Exception : " + e.toString());
			System.err.println("Only message : " + e.getMessage());
		}

		System.out.println("main method ended");
	}
}
