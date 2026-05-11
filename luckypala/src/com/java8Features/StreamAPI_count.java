package com.java8Features;

import java.util.stream.Stream;

public class StreamAPI_count {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		long count =
		        Stream.of(10,20,30)
		              .count();

		System.out.println(count);
	}
}
