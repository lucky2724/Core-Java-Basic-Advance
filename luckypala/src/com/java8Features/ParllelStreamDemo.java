package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class ParllelStreamDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Jerry", "Jim");
		
		names.parallelStream()
			.forEach(name->System.out.println(Thread.currentThread().getName()+" -> "+name));
	}
}
