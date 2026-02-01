package com.tasks;

public class Mobile {
	//Constructor Overloading
	String brand;
	double price;
	String colour;
	
	Mobile(){
		System.out.println("no-arg constructor called");
		brand="Unknown";
		price=0.99;
		colour="Unknown";
	}
//	
//	Mobile(String brand,double price){
//		System.out.println("2-arg constructor called");
//		this.brand=brand;
//		this.price=price;
//	}
	
	Mobile(String brand,double price,String colour){
		System.out.println("3-arg constructor called");
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	
	}
	
	Mobile(double price,String brand,String colour){
		System.out.println("3-arg constructor called");
		this.brand=brand;
		this.price=price;
		this.colour=colour;
	
	}
	
	void show() {
		System.out.println("===========================");
		System.out.println("Mobile Brand  : "+brand);
		System.out.println("Mobile Colour : "+colour);
		System.out.println("Mobile Price  : "+price);
		System.out.println("===========================");
	}
	public static void main(String[] args) {
		System.out.println("main method started..");
		Mobile m1=new Mobile();
		m1.show();
//		
//		Mobile m2=new Mobile("Iphone",59999.99);
//		m2.show();
		
		Mobile m3=new Mobile("Iphone 16 pro",99999.99,"White titanium");
		m3.show();
		
		Mobile m4=new Mobile(59999,"Iphone 12","green");
		m4.show();
		
		
		
	}
}
