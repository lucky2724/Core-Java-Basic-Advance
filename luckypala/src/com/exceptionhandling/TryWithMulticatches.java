package com.exceptionhandling;

public class TryWithMulticatches {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("main method started..");

		try {
			String s = null;
			String s1 = "Srikanth";

			System.out.println("In try");
			System.out.println(10 / 2);// 5
			System.out.println(0.0 / 0.0);// NaN
			System.out.println(10.5 / 0);// Infinity
			System.out.println(10.5 / 0.0);// Infinity

			System.out.println(s1.charAt(9)); // By Exception because it is java.lang.StringIndexOutOfBoundsException
			System.out.println(s.length()); // Null pointer Exception
			System.out.println(0 / 0); // Arithmetic Exception
		} catch (ArithmeticException ar) {
			System.err.println("In catch Of AR");
			System.err.println(ar.getMessage());
		} catch (NullPointerException np) {
			System.err.println("In Catch Of NP");
			System.err.println(np.getMessage());
		} catch (Exception e) {
			System.err.println("In Catch Of Ex");
			System.err.println(e.toString());
		}

		System.out.println("main method ended");
	}
}
