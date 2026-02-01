package com.typesOfMethods;

public class AllMethodsInoneFrame {
	 void main(String[] args) {
		System.out.println("main method started..");
		hello();
		hello(10,20);
		double sum=fun();
		System.out.println("sum : "+sum);
		int mul=fun(5,5);
		System.out.println("mul : "+mul);
		
	}
	
	//without return type + without args
	void hello() {
		System.out.println("Helloo java...");
		System.out.println("Java is Simple..");
	}
	
	//without return type + with args
	void hello(int a,int b) {
		System.out.println("sum of a and b is "+(a+b));
	}
	
	//with return type + without args
	double fun() {
		int a=10;
		int b=20;
		
		return a+b;
	}
	
	//with return type + with args
	int fun(int a,int b) {
		return a*b;
	}
	
}
