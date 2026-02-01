package com.tasks;

public class Calculator {
	int addition(int a,int b) {
		return a+b;
	}
	
	int subtraction(int a,int b) {
		return b-a;
	}
	
	int multiplication(int a,int b) {
		return a*b;
	}
	
	double division(int a,int b) {
		return (double) a/b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		Calculator c1=new Calculator();
		int add=c1.addition(10,20);
		int sub=c1.subtraction(10,20);
		int mul=c1.multiplication(5,4);
		double div=c1.division(15,4);
		
		System.out.println("======== Calculator ==========");
		System.out.println("Addition : "+add);
		System.out.println("Subtraction : "+sub);
		System.out.println("Mulltiplication : "+mul);
		System.out.println("Divison : "+div);
	}
}
