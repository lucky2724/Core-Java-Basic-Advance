package com.typesOfMethods;

public class NoReturnWithArguments {
	void add(int a,int b) {
		System.out.println("sum:"+(a+b));
	}
	
	void add() {
		System.out.println("No args");
	}
	
	void sub(int a,int b) {
		System.out.println("dif:"+(a-b));
	}
	
	void mul(int a,int b) {
		System.out.println("mul:"+a*b);
	}
	
	void div(int a,int b) {
		System.out.println("div:"+a/b);
	}
	
	void mod(int a,int b) {
		System.out.println("mod:"+a%b);
	}
	
	
	public static void main(String[] args) {
		NoReturnWithArguments t1=new NoReturnWithArguments();
		t1.add();
		t1.add(3,2);
		t1.sub(5, 3);
		t1.mul(5, 5);
		t1.div(10, 3);
		t1.mod(10, 4);
	}
	
}
