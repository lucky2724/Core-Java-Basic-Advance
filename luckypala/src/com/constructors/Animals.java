package com.constructors;

//super()
public class Animals {
	String name="Puppy";
	int age=6;
	
	Animals(){
		System.out.println("no-args constructor from animal..");
	}
	
	Animals(int age){
		
		System.out.println("1-args constructor from animal..");
		this.age=age;
	}
	
	Animals(String name,int age){
		System.out.println("2 arg constructor from Animmal..");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started from Animals..");
	}
}


class Dogs extends Animals{
	String name="Chinnu";
	
	Dogs(){
		//super();//autmoatically
		super(118);
		System.out.println("no-args constructor from Dogs..");
		
	}
	
	Dogs(int age){
		//super(); -By default
		System.out.println("1 arg constructor fron Dogs..");
		this.age=age;
	}
	
	Dogs(String name,int age){
		super(name,age); 
		System.out.println("2 arg constructor from Dogs..");
		this.name=name;
		this.age=age;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main method started from Dogs...");
		
		Dogs d=new Dogs();
		System.out.println(d.name);
		System.out.println(d.age);
		
		Dogs d1=new Dogs(10); //calling default constructor --> calling super() automatically 
		System.out.println(d1.name);
		System.out.println(d1.age);
		
		Dogs d2=new Dogs("Chintu Bhaii",46);
		System.out.println(d2.name);
		System.out.println(d2.age);
		
		
	}
}
