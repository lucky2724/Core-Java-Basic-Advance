package com.constructors;

public class Course {
	int id;
	String course;
	int duration;
	
	Course(int id,String course,int duration){
		System.out.println("3 arg parametrized constructor..");
		this.id=id;
		this.course=course;
		this.duration=duration;
		
	}
	
	Course(int id,String course){
		System.out.println("2 arg parametrized constructor..");
		this.id=id;
		this.course=course;
		this(id,course,6);
	}
	
	Course(int id){
		System.out.println("1 arg parametrized constructor..");
		this.id=id;
		this(id,"python");
	}
	
	
	void show() {
		System.out.println("**************************");
		System.out.println("Course Id       : "+id);
		System.out.println("Course Name     : "+course); 
		System.out.println("Course Duration : "+duration);
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started...afjha;fpas");
		Course c1=new Course(1,"Java",6);
		c1.show();
		
		Course c2=new Course(2,"Python");
		c2.show();
		
		Course c3=new Course(3); 
		c3.show();
		
	}
}
