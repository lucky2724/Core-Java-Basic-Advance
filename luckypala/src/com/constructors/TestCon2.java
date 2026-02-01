package com.constructors;

public class TestCon2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		//Another class object
		TestCon1 t1=new TestCon1(); //Test-1 no-arg constructor called
		t1.name="Luckyyyyy";
		System.out.println(t1.name);
		
		//if your constructor is private we can not create objects outside of the clsses
	}
}
