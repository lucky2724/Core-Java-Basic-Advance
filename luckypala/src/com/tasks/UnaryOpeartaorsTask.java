package com.tasks;

public class UnaryOpeartaorsTask {
	public static void main(String[] args) {
		System.out.println("main methods started...");
		
		int x=1;
		int result=x++ - ++x + x-- - --x + x++ - x + --x + x-- -++x;
		System.out.println("Result : " +result);
		System.out.println("x val : " +x);
		
		System.out.println();
		
		int a=1;
		int result2=a++ - ++a - a++ + --a + a-- - a + ++a - a--;
		System.out.println("Result : " +result2);
		System.out.println("x val : " +a);
		
	}
}
