package com.accessmodifiers02;

import com.accessmodifiers01.PublicAMDemo;


public class Demo  {
	public static void main(String[] args) {
		System.out.println("main method started");

		PublicAMDemo p1 = new PublicAMDemo();
		System.out.println(p1.a);
		System.out.println(p1.name);
		p1.method2();
		
		
	}
}
