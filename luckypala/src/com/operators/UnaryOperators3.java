package com.operators;

public class UnaryOperators3 {
	public static void main(String[] args) {
		System.out.println("main method started...");
		int a=9;
		
		System.out.println(a++ + ++a + a++ + --a + ++a + --a +a);
		System.out.println("a val : "+ a);
	}
}
