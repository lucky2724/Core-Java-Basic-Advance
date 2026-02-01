package com.operators;

public class BitWise_Operators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int a=15;
		int b=10;
		
		System.out.println(a & b);//10
		System.out.println(a | b);//15
		
		System.out.println(34 & 15);//2
		System.out.println(28 & 65);//0
		System.out.println(15 & 39);//7
		
		System.out.println(34 | 15);//47
		System.out.println(28 | 65);//93
		System.out.println(15 | 39);//47
	}
}
