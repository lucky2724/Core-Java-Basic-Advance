package com.operators;

public class Realational_Operators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int a=50;
		int b=100;
		int c=50;
		
		//Relational operators
		//==,<=,<,>=,>,!=,
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a<b);
		System.out.println(a<=c);
		System.out.println(a>b);
		System.out.println(a>=c);
		System.out.println(a!=b);
		System.out.println(a!=c);
		
		System.out.println("*********************************");
		String s1="srikanth";
		String s2="Srikanth";
		System.out.println(s1==s2);
		System.out.println(s1.equalsIgnoreCase(s2));
		
		String s3="Lucky";
		String s4=new String("Lucky");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}
}

