package com.constructors;

class Vehicle{
	String name="GT-650";
}

class Car extends Vehicle{
	//Variable override
	String name="RE";
	
	 void show() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
}

public class ConstructorSUPER {
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		Car c1=new Car();
		System.out.println(c1.name);
		c1.show();
		System.out.println("main methoddd ended...");
	}
}
