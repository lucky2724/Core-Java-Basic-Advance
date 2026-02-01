package com.operators;

public class RelationalOperators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		//==,<,<=,>,>=,!=
		int a=10;
		int b=20;
		 
		System.out.println(a==b); //false
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		
		System.out.println("*************");
		int x=50;
		int y=50;
		int z=100;
		
		System.out.println(x==y); //true
		System.out.println(x==z); //false
		System.out.println(x>=y); //true
		System.out.println(x<=y); //true
		
		System.out.println("***************");
		String s1="srikanth";
		String s2="Srikanth";
		System.out.println(s1==s2);
		
	}
}
