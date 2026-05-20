package com.java8Features;

import java.util.Optional;

public class OptionalDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String[] names = { "AbhiShek", "Virat", "SKY", "Tilak", null, "Srikanth", null, "Lucky" };

		for (String name : names) {
			Optional<String> op = Optional.ofNullable(name);

			if (op.isPresent()) {
				System.out.println(op.get().toUpperCase());
			} else {
				System.out.println("Name is not available !!!6");
			}
		}
	}
}
