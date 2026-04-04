package com.advancedConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Java8FeaturesDemo27 {
	static final String OLD_FORMAT = "dd/MM/yyyy";
	static final String NEW_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {
		System.out.println("main method started");

		long millis = System.currentTimeMillis();
		System.out.println(millis);

		Date date = new Date(millis);
		Date date1 = new Date();

		System.out.println("Date : " + date);
		System.out.println("Date1 : " + date1);

		String s = "1234";
		int n = Integer.parseInt(s);
		System.out.println(n);
		System.out.println(String.valueOf(n));

		String oldDateString = "12/08/2025";
		String newDateString;

		SimpleDateFormat sdf = new SimpleDateFormat();
		Date d = sdf.parse(oldDateString);

		sdf.applyPattern(NEW_FORMAT);
		newDateString = sdf.format(d);

		System.out.println(oldDateString);
		System.out.println(newDateString);
	}
}
