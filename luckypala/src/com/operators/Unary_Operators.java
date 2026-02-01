package com.operators;

public class Unary_Operators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		//+,++,-,--
		int a=5;
		System.out.println(a++ + ++a + a-- + --a +a);
		System.out.println("a value : "+a);
	}
}
