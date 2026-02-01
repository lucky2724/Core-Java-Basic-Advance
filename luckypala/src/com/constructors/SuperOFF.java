package com.constructors;

class Person2{
	String name;
	
	Person2(String name){
		this.name=name;
		System.out.println("Parent class constructor called : "+name);
	}
}

class Employee extends Person2{
	int id;
	Employee(int id,String name){
		super(name);
		this.id=id;
		System.out.println("Child class constructor called : "+id);
	}
}

public class SuperOFF {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Employee e1=new Employee(101,"Luckyyy");
		System.out.println("Address of e1 object : "+e1);
	}
}
