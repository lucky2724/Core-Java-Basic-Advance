package com.casestudy;

public class Student {
	String stName;
	int stRno;
	String course;
	
	Student(){
		System.out.println("No-arg Constructor");
		stName="Unknown";
		stRno=100;
		course="NA";
	}
	
	Student(String stName){
		System.out.println("1 arg constructor");
		this.stName=stName;
	}
	
	Student(String stName,int stRno){
		System.out.println("2 arg constructor");
		this.stName=stName;
		this.stRno=stRno;
	}
	
	Student(String stName,int stRno,String course){
		System.out.println("3 arg constructor");
		this.stName=stName;
		this.stRno=stRno;
		this.course=course;
	}
	
	void show() {
		System.out.println("===============================");
		System.out.println("Student Name : "+stName);
		System.out.println("Student Roll Num : "+stRno);
		System.out.println("Course  : "+course);
	}
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		
		Student s2=new Student("Lucky");
		
		s2.show();
		
		Student s3=new Student("Surya",103);
		s3.show();
		
		Student s4=new Student("Java programming",105,"AWS_Devops");
		s4.show();
		
		
	}
}
