package com.exceptionhandling;

import java.util.Scanner;

public class TryWithMulticatches02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		try {
			System.out.println("in try");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n = sc.nextInt();

			int a = 10 / n;

			System.out.println("A val : " + a);
			String s = "Lucky";
			System.out.println(s.charAt(a));

			sc.close();

		} catch (ArithmeticException ar) {
			System.err.println("in Catch of AR");
			ar.printStackTrace();
		} catch (NullPointerException np) {
			System.err.println("In Catch of np");
			np.printStackTrace();
		} catch (RuntimeException re) {
			System.err.println("In Catch RE");
			re.printStackTrace();
		} catch (Exception e) {
			System.err.println("In catch Of Ex");
			e.printStackTrace();
		}

		System.out.println("main method ended");

	}
}
