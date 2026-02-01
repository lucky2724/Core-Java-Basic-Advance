package com.operators;

public class LogicalOperators {
	// && || !
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main method started...");
		int a=10;
		int b=20;
		
		String name1="srikanth";
		String name2=new String("srikanth");
		
		System.out.println("****** && INFO *****");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false

		System.out.println("****** && INFO EXAMPLES *****");
		System.out.println(a!=b && name1.equals(name2));//true
		System.out.println(a==b && name1.equals(name2));//false
		System.out.println(a!=b && !name1.equals(name2));//false
		System.out.println(a==b && !name1.equals(name2));//falsee
		
		
		System.out.println("****** || INFO *****");
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		System.out.println("****** && INFO EXAMPLES *****");
		System.out.println(a!=b || name1.equals(name2));//true
		System.out.println(a==b || name1.equals(name2));//fals
		System.out.println(a!=b || !name1.equals(name2));//true
		System.out.println(a==b || !name1.equals(name2));//false
		
		System.out.println("****** ! INFO *****");
		System.out.println(!true);
		System.out.println(!false);
	}
}
