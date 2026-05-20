package com.java8Features;

import java.time.LocalTime;

public class DateAPIDemo05 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LocalTime lt = LocalTime.now();

		System.out.println(lt);

		int hrs = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();

		System.out.printf("%d:%d:%d", hrs, min, sec);
	}
}
