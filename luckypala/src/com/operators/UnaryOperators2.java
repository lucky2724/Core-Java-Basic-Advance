package com.operators;

public class UnaryOperators2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int i=0;
		System.out.println(i++ + ++i +i + i++);//6
		System.out.println("i val : "+i);//3
		
		int x=5;
		System.out.println(++x + --x + ++x + x++);//23
		System.out.println("x val : "+x);//7
																								
	}
}
