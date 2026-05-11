package com.java8Features;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo01 {
	public static void main(String[] args) {

		Supplier<Date> s1 = () -> new Date();
		System.out.println(s1.get());

		System.out.println("-----------------------------");

		Supplier<String> s2 = () -> {

			String otp = "";

			for (int i = 0; i < 6; i++) {
				otp += (int) (Math.random() * 10);
			}

			return otp;
		};

		System.out.println("Random OTP : " + s2.get());

	}
}
