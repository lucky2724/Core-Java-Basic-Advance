package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_sorted {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		List<Integer> list =
                Arrays.asList(40,10,30,20);

        list.stream()
            .sorted()
            .forEach(System.out::println);
        
        System.out.println("---------------");
        
        list.stream()
	        .sorted((a,b) -> b-a)
	        .forEach(System.out::println);
	}
}
