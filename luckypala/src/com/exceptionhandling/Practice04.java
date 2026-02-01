package com.exceptionhandling;

public class Practice04 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
			String s=null;
			System.out.println(s.length());
			System.out.println(10 / 0);
		} catch (ArithmeticException | NullPointerException ar) {
			System.err.println("In Catch AR or Np");
			System.err.println(ar.getMessage());
		} catch (Exception e) {
			System.err.println("In Catch E");
			System.err.println(e.getMessage());
		}
		
	}
}
