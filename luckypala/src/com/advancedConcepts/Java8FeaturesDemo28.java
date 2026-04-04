package com.advancedConcepts;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Java8FeaturesDemo28 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LocalDateTime lt1 = LocalDateTime.of(2004, 4, 24, 12, 30);
		System.out.println("BirthDate : " + lt1);

		System.out.println("BirthDate After 6 months  : " + lt1.plusMonths(6));
		System.out.println("BirthDate Before 6 months  : " + lt1.minusMonths(6));

		System.out.println("--------------------------");

		LocalDateTime lt = LocalDateTime.now();
		System.out.println(lt);

		System.out.println("--------------------------");

		int m1 = lt.getMonthValue();
		int d1 = lt.getDayOfMonth();
		int yy = lt.getYear();

		int hr = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();

		System.out.printf("%d-%d-%d %d:%d:%d", d1, m1, yy, hr, min, sec);

		System.out.println();
		System.out.println("---------------------");

		LocalDate ld = LocalDate.now();
		System.out.println("Current date : " + ld);

		int m2 = lt.getMonthValue();
		int d2 = lt.getDayOfMonth();
		int yy2 = lt.getYear();

		System.out.printf("Update Date :  " + "%d/%d/%d", d2, m2, yy2);
		System.out.println();
		System.out.println(ld.plusMonths(7));

		System.out.println("---------------------");
		LocalTime lt2 = LocalTime.now();
		System.out.println(lt2);

		int hrs = lt.getHour();
		int mins = lt.getMinute();
		int secs = lt.getSecond();

		System.out.printf("%d:%d:%d", hrs, mins, secs);
		
	}
}
