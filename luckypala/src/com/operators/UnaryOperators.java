package com.operators;

public class UnaryOperators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		//Unary Operators
		//+,-,++,--
		//pre-increment post-decrement
		//post-increment post0-decrement
		int a=5;
		int b=10;
		
		System.out.println(+a);//5
		//System.out.println(Math.abs(-a));//5
		System.out.println(-b);//-10
		
		System.out.println(a++);//5 --> 6
		System.out.println(++a);//7
		System.out.println(++a);//8
		System.out.println(--a);//7
		System.out.println(a--);//7 --> 6
		System.out.println(++a);//7
		System.out.println(a++);//7 --> 8
		System.out.println(a--);//8 --> 7
		System.out.println("**********************");
		System.out.println(--b);//9
		System.out.println(--b);//8
		System.out.println(b--);//8 --> 7
		System.out.println(++b);//8
		System.out.println(++b);//9
		System.out.println(--b);//8
		System.out.println(b++);//8 --> 9
		System.out.println(b--);//9 --> 8
		System.out.println(b+2);//10 --> 8
		
		
		System.out.println("a val : "+a);//7
		System.out.println("b val : "+b);//8
		
		System.out.println(a++ + b--);//15
		System.out.println("a val : "+a);//8
		System.out.println("b val : "+b);//7
		
		System.out.println(++a + a++ + --b + b--);
		System.out.println("a val : "+a);//10
		System.out.println("b val : "+b);//5
		
		System.out.println(b++ + ++a + ++b + a++);
		System.out.println("a val : "+a);//12
		System.out.println("b val : "+b);//7
		
		
		System.out.println(a-- + --a + --b + b--);
		System.out.println("a val : "+a);//10
		System.out.println("b val : "+b);//5
		
	}
}
