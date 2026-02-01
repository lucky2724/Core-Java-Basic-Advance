package com.constructors;

public class Studentt {
	String name;
	int age;
	String course;
	
	Studentt(){
		this("Unknown",18);
		System.out.println("no arg constructor");
		System.out.println(name);
	}
	
	Studentt(String name,int age){
		this(name,age,"Java");
		System.out.println("2 arg constructor");
		System.out.println(name+" "+age);
	}
	
	Studentt(String name,int age,String course){
		this.name=name;
		this.age=age;
		this.course=course;
		System.out.println("3 arg constructor");
		System.out.println(course);
	}
	
	void display() {
		System.out.println("Name : "+name+" Age  : "+age+" Course : "+course);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		Studentt s1=new  Studentt("Kohli",18);
		s1.display();
	}
}
