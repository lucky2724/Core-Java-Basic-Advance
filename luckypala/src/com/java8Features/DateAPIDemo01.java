package com.java8Features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAPIDemo01 {

	static final String OLD_FORMAT = "dd/MM/yyyy";
	static final String NEW_FORMAT = "yyyy-MM-dd";

	public static void main(String[] args) throws ParseException {
		System.out.println("main method started !!");

		long millis = System.currentTimeMillis();
		System.out.println(millis);

		Date date = new Date(1779205991914L);
		Date date1 = new Date();

		System.out.println(date);
		System.out.println(date1);

		String oldDateString = "12/08/2025";
		String newDateString;

		SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);

		Date d = sdf.parse(oldDateString);

		System.out.println(d);

		sdf.applyPattern(NEW_FORMAT);

		newDateString = sdf.format(d);

		System.out.println("-----------------");

		System.out.println("Old Date : " + oldDateString);
		System.out.println("New date : " + newDateString);
	}
}
