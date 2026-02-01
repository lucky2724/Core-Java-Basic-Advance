package com.operators;

public class ComparisionOperators {
	public static void main(String[] args) {
		System.out.println("main method started...");
		String s1="Srikanth";
		String s2="Srikanth"; //String literals
		
		String s3="Java";
		String s4=new String("Java");  //String objects
		
		System.out.println(s1==s2);//false
		System.out.println(s3==s4);//false
		
		String s5=new String("vcube");
		String s6=new String("vcube");
		
		System.out.println(s5==s6);//false
		System.out.println(s5.equals(s6));//true
		
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}
}
