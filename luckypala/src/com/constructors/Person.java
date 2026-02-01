package com.constructors;

public class Person {
	String name;
	int id;
	int age;
	
	Person(){
		System.out.println("no-arg constructor called from person..");
	}
	
	Person(String name,int id,int age){
		//error through if does not contain no-arg constructor
		this.name=name;
		this.id=id;
		this.age=age;
	}
	
	public static void main(String[] args) {
		System.out.println("main method started from person...");
	}

}

class Student2 extends Person{
	void show() {
		System.out.println("==============================");
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Age : "+age);
	}
	
	Student2(){
		System.out.println("no-arg constructors from student");
	}
	
	Student2(String name,int id,int age){
		super(name,id,age);
	}
	public static void main(String[] args) {
		System.out.println("main method started from student..");
		Student2 s1=new Student2();
		s1.show();
		
		Student2 s2=new Student2("Sirisha",888,21);
		s2.show();
		
		
	}
}
