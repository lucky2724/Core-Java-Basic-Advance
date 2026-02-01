package com.constructors;

public class Constructors03 {
	int id;
	String name;
	long phone;
	int age;
	
	//no arg constructor
	 Constructors03(){
		 this(101);//calling 1-arg constructor into no arg constructor
		 System.out.println("no-arg constructor called..");
	 }
	 
	 //1-arg constructor
	 Constructors03(int id){
		 this(id,"Unknown");
		 System.out.println("1 arg constructor");
		// this.id=id;
	 }
	 
	 //2-arg constructor
	 Constructors03(int id,String name){
		 this(id,name,960006);
		 System.out.println("2 arg constructor");
		 //this.id=id;
		// this.name=name;
	 }
	 
	 //3-arg constructor
	 Constructors03(int id,String name,long phone){
		 this(id,name,phone,21);
		 System.out.println("3 arg constructor");
		 //this.id=id;
		 //this.name=name;
		 //this.phone=phone;
	 }
	 
	 //4-arg construuctor
	 Constructors03(int id,String name,long phone,int age){
		 System.out.println("4 arg constructor");
		 this.id=id;
		 this.name=name;
		 this.phone=phone;
		 this.age=age;
	 }
	 
	 void show() {
		 System.out.println("=========================");
		 System.out.println("Id    : "+id);
		 System.out.println("Name  : "+name);
		 System.out.println("Phone : "+phone);
		 System.out.println("age   : "+age);
	 }
	public static void main(String[] args) {
		System.out.println("main method started..");
		 Constructors03 c1=new  Constructors03();
		 c1.show();
		 
		 Constructors03 c2=new  Constructors03();
		 c2.show();
		 
		 Constructors03 c3=new  Constructors03(111);
		 c3.show();
		 
		 
		 Constructors03 c4=new  Constructors03(222,"Srikanth");
		 c4.show();
		 
		 Constructors03 c5=new  Constructors03(333,"Vishwa",955987);
		 c5.show();
		 
		 Constructors03 c6=new  Constructors03(444,"Lucky",900987,22);
		 c6.show();
		 
		 
		 
		 
	}
}