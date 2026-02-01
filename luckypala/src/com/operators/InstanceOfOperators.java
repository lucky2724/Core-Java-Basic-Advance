package com.operators;

public class InstanceOfOperators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Integer i = 10;
		// conversion of primitive to wrapper is Auto-Boxing
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);
		
		String name="Java";
		
		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);
		
		System.out.println(null instanceof String);
		System.out.println(null instanceof Integer);
		System.out.println(null instanceof Object);
	}
}
