package com.constructors;

public class Constructors04 {
	int id;
	String name;
	int age;
	boolean isPass;
	int marks;
	
	Constructors04(){
		System.out.println("n0-arg constructors called...");
		name="Unknown";
	}
	
	Constructors04(String name){
		this.name=name;
	}
	
	Constructors04(Constructors04 c,int id){
		this.name=c.name;
		this.id=id;
	}
	
	Constructors04(Constructors04 c,int age,int marks){
		this.age=age;
		this.marks=marks;
		this.name=c.name;
		this.id=c.id;
	}
	
	Constructors04(Constructors04 c,boolean isPass){
		this.isPass=isPass;
		this.age=c.age;
		this.marks=c.marks;
		this.name=c.name;
		this.id=c.id;
	}
	
	
	
	void show() {
		System.out.println("===================================");
		System.out.println("Id : "+id);;
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Pass(true/false) : "+isPass);
		System.out.println("Marks : "+marks);
		System.out.println("===================================");
	}
	
	public static void main(String[] args) {
		System.out.println("main method is started...");
		
		Constructors04 c1=new Constructors04 ();
		c1.show();
		
		Constructors04 c2=new Constructors04 ("Lucky pala");
		c2.show();
		
		Constructors04 c3=new Constructors04 (c2,1001);
		c3.show();
		
		Constructors04 c4=new Constructors04 (c3,21,99);
		c4.show();
		
		Constructors04 c5=new Constructors04 (c4,true);
		c5.show();
		
		
		
		
	}
}
