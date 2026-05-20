package com.java8Features;

import java.time.LocalDateTime;

public class DateAPIDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LocalDateTime lt1 = LocalDateTime.of(2004, 4, 24, 10, 40);
		System.out.println("BirthDate : " + lt1);
		System.out.println("Birthdate after 6 months : " + lt1.plusMonths(6));
		System.out.println("BirthdDate before 6 months : " + lt1.minusMonths(6));

		System.out.println("--------------------------------------");

		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);

	}
}
