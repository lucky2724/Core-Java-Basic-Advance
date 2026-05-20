package com.java8Features;

import java.time.LocalDate;

public class DateAPIDemo04 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LocalDate ld = LocalDate.now();

		System.out.println(ld);

		int mon = ld.getMonthValue();
		int yy = ld.getYear();
		int day = ld.getDayOfMonth();

		System.err.println("-----------------");

		System.out.printf("%d-%d-%d", day, mon, yy);

	}
}
