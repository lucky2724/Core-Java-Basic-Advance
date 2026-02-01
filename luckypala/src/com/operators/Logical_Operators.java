package com.operators;

public class Logical_Operators {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("main method started..");
		//Logical operators
		//     ==> && || !
		int a=50;
		int b=50;
	
		
		String s1="Lucky";
		String s2=new String("Lucky");
		
		
		System.out.println("****** && Info *******");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false &&  true);
		System.out.println(false && false);
		System.out.println("************");
		System.out.println(a==b  &&  s1.equals(s2));
		System.out.println(a==b  && !s1.equals(s2));
		System.out.println(a!=b  &&  s1.equals(s2));
		System.out.println(a!=b  && !s1.equals(s2));
		
		int x=10;
		int y=10;
		
		String str1="Surya";
		String str2=new String("sUrYa");
		
		System.out.println("****** || Info *******");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.println("************");
		System.out.println(x==y || str1.equalsIgnoreCase(str2));
		System.out.println(x==y || !str1.equalsIgnoreCase(str2));
		System.out.println(x!=y || str1.equalsIgnoreCase(str2));
		System.out.println(x!=y || !str1.equalsIgnoreCase(str2));
		
		
		
		System.out.println("****** ! Info *******");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(a!=b);
		
		
	}
}
