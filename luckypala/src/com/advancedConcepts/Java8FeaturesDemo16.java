package com.advancedConcepts;

import java.util.Date;
import java.util.function.Supplier;

public class Java8FeaturesDemo16 {
	public static void main(String[] args) {

		Supplier<Date> s2 = () -> new Date();

		System.out.println("Current Date : " + s2.get());

		// returns double value with positive sign
		// System.out.println((int) (Math.random() * 10));

		Supplier<String> s1 = () -> {
			String otp = "";

			for (int i = 1; i <= 6; i++) {
				otp += (int) (Math.random() * 10);
			}

			return otp;
		};

		System.out.println("Random OTP : " + s1.get());

		System.out.println("------------------------------");

	}
}
