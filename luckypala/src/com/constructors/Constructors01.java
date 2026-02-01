package com.constructors;

public class Constructors01 {
	int sid;
	String name;
	int age;
	
	Constructors01(){
		System.out.println("No-arg Constructor called");
		sid=1;
		name="Unknown";
		age=18;
	}
	
	//intance data we can access instance method dircetly
	void show() {
		System.out.println("****************************");
		System.out.println("Student id:"+sid);
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
	}
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		
		//if there is no constructors in class then Java complier take default constructor
		//this is No-arg constructor.
		Constructors01 c1=new Constructors01();
		c1.sid=101;
		c1.name="lucky";
		c1.age=21;
		System.out.println("Student id:"+c1.sid);
		System.out.println("Student name:"+c1.name);
		System.out.println("Student age:"+c1.age);
		
		
		Constructors01 c2=new Constructors01();
		//printing default values of no-arg construcor user provide
		c2.show();
		
		Constructors01 c3=new Constructors01();
		c3.sid=102;
		c3.name="Surya";
		c3.age=25;
		c3.show();
	}
	
}
