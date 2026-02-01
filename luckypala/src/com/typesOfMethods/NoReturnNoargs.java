package com.typesOfMethods;

public class NoReturnNoargs {
	
	{
		System.out.println("Instance block is called...");
	}
	
	//static method
	static void display() {
		System.out.println("Display method is called...");
		NoReturnNoargs t1=new NoReturnNoargs();
		t1.show();
	}
	
	//instance method
	void show() {
		//display();
		System.out.println("Show method is called...");
	}
	
	void main() {
		System.out.println("main method started....");
		display();
		show();
	}

}
