package com.constructors;

public class Student {
	String name;
	int age;
	int marks;
	
	Student(){
		System.out.println("no args constructor");
		name="Unknown";
		age=17;
		marks=35;
	}
	
	Student(String name,int age){
		System.out.println("parameterized constructor..");
		this.name=name;
		this.age=age;
		
	}
	
	Student(String name,int age,int marks){
		System.out.println("Paraneterized constructor");
		this.name=name;
		this.age=age;
		this.marks=marks;
		
	}
	
	void show() {
		System.out.println("**************************");
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
		System.out.println("Strudent marks:"+marks);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		Student s1=new Student();
		s1.show();
		
		Student s2=new Student();
		s2.show();
		
		Student s3=new Student("Lucky",21);
		s3.show();
		
		Student s4=new Student("pandu",25,80);
		s4.show();
		
		
	}
}
