package com.typesOfMethods;
import java.util.Scanner;

public class Calculator {
	static void add(int a,int b) {
		System.out.println("Sum is:"+(a+b));
	}
	
	static void sub(int  a,int b) {
		System.out.println("Difference is:"+(a-b));
	}
	
	static void mul(int a,int b) {
		System.out.println("Multiplication is:"+a*b);
	}
	
	static void div(int a,int b) {
		System.out.println("Division is:"+a/b);
	}
	
	static void mod(int a,int b) {
		System.out.println("modulas is:"+a%b);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println(sc);

		System.out.print("Enter first number:");
		int a=sc.nextInt();
		
		System.out.print("Enter second number:");
		int b=sc.nextInt();
		
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		mod(a,b);
		
		sc.close();
	}
}
