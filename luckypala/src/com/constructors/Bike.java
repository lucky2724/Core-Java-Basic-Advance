package com.constructors;

public class Bike {
	String name;
	int cc;
	String model;
	int year;
	
	Bike(){
		System.out.println("no arg constructor called");
		this("Pulsar",150,2024);
	}
	
	
	
	Bike(String name,int cc,int year){
		System.out.println("3 arg constructor called");
		this.name=name;
		this.cc=cc;
		this.year=year;
		this("GT");
	}
	
	Bike(String model){
		System.out.println("1 arg constructor called");
		this.model=model;
	}
	
	void show() {
		System.out.println("==========================");
		System.out.println("Bike Name:"+name);
		System.out.println("Bike Cc:"+cc);
		System.out.println("Bike model:"+model);
		System.out.println("Bike year:"+year);
		System.out.println("==========================");
	}
	public static void main(String[] args) {
		System.out.println("main method started..");
		Bike b1=new Bike();
		b1.show();
	}
}
