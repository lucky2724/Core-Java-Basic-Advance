package com.advancedConcepts;

import java.util.Optional;

public class Java8FeaturesDemo26 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String[] names = new String[5];
		names[4] = "SRIKANTH JAVA";

		for (String name : names) {

//			if(name!=null) {
//				System.out.println(name);
//			}

			Optional<String> isNull = Optional.ofNullable(name);

			if (isNull.isPresent()) {
				System.out.println(name.toLowerCase());
			}
		}

	}
}
