package com.java8Features;

import java.util.Optional;

class Employee1 {
	String email;

	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
}

public class OptionalDemo02 {
	public static void main(String[] args) {
		System.err.println("main method started");

		Employee1 emp = new Employee1();
		System.out.println(emp.getEmail().orElse("Un-Known Email !!").toUpperCase());

	}
}
