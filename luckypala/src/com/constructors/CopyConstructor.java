package com.constructors;

public class CopyConstructor {
	String name;
	int age;
	int marks;
	double height;
	
	CopyConstructor(){
		System.out.println("no-arg constructor");
		name="Unknown";
		marks=35;
	}
	
	CopyConstructor( CopyConstructor c,int age){
		this.age=age;
		this.name=c.name;
		this.marks=c.marks;
	}
	
	CopyConstructor( CopyConstructor c,double height){
		this.height=height;
		this.name=c.name;
		this.marks=c.marks;
		this.age=c.age;
	}
	
	CopyConstructor( CopyConstructor c,int marks,String name){
		this.marks=marks;
		this.name=name;
		this.height=c.height;
		this.age=c.age;
	}
	
	void show() {
		System.out.println("================================");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Marks : "+marks);
		System.out.println("Height : "+height);
		System.out.println("================================");
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		CopyConstructor c1=new CopyConstructor();
		c1.show();
		
		CopyConstructor c2=new CopyConstructor(c1,25);
		c2.show();
		
		CopyConstructor c3=new CopyConstructor(c2,4.2 );
		c3.show();
		
		CopyConstructor c4=new CopyConstructor(c3,99,"Pichii Prasanna");
		c4.show();
	}
}
