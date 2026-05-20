package com.java8Features;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DateAPIDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		LocalDateTime lt = LocalDateTime.now();

		System.out.println(lt);
		
		int m1 = lt.getMonthValue();
		int d1 = lt.getDayOfMonth();
		int yy = lt.getYear();

		int hr = lt.getHour();
		int min = lt.getMinute();
		int sec = lt.getSecond();
		
		DayOfWeek day=lt.getDayOfWeek();
		System.out.println(day);
		
		System.out.printf("%d-%d-%d  %d:%d:%d ",d1,m1,yy,hr,min,sec);

	}
}
