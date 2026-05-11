package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_distinct {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		 List<Integer> list =
	                Arrays.asList(10,20,10,30,20);

	        list.stream()
	            .distinct()
	            .forEach(System.out::println);
        
        System.out.println("---------------------");
	}
}
