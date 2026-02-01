package com.tasks;

public class Student {
	String name;
	int rollNo;
	int marks;
	
	Student(){
		System.out.println("no-arg constructor called..");
		name="Unknown";
		
	}
	
	Student(String name,int rollNo,int marks){
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	Student(Student s,int marks){
		this.marks=marks;
		this.name=s.name;
		this.rollNo=s.rollNo;
	}
	
	void display() {
		System.out.println("===============================");
		System.out.println("Student Name     : "+name);
		System.out.println("Student roll num : "+rollNo);
		System.out.println("Student marks    : "+marks);
		System.out.println("===============================");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		Student s=new Student();
		s.display();
		
		
		
		Student s1=new Student("Luckyyy",101,45);
		s1.display();
		
		Student s2=new Student(s1,95);
		s2.display();
		
		
	}
}
