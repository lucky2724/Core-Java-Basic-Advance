package com.constructors;

public class TestCon1 {
	String name;
	//if we create private for constructors we can not create object outside of the class
	TestCon1(){
		System.out.println("no-arg constructor from Test-02");
	}
	public static void main(String[] args) {
		System.out.println("main method started..");
	}
}
