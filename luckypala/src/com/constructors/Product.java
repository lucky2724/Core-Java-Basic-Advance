package com.constructors;

public class Product {
	int id;
	String s;
	
	Product(){
		this(101);
		System.out.println("no arg constructor caalled");
		
	}
	
	Product(int id){
		this("Santhoor");
		System.out.println("Productt id "+id);
	}
	
	Product(String s){
		System.out.println("Product Name "+s);
	
	}
	
	void show() {
		System.out.println(id);
		System.out.println(s);
	}
	public static void main(String[] args) {
		System.out.println("main method started..");
		Product p=new Product();
		p.show();
	}
}
