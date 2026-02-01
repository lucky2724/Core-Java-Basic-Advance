package com.exceptionhandling;

public class FinallyDemo {
	public static void main(String[] args) {
		System.out.println("main method started..");

		try {
			System.out.println("in try");
			System.exit(0);
			// System.out.println(10 / 0);
			return;
		} catch (Exception e) {
			System.err.println("in Catch");
		} finally {
			System.out.println("in finally !!!");
		} // finally block always execute except System.exit(0) or any number

		System.out.println("main method ended");
	}
}
