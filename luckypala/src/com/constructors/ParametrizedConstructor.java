package com.constructors;

public class ParametrizedConstructor {
	int id;
	String name;
	int age;
	
	 ParametrizedConstructor(int id,String name,int age){
		 System.out.println("Parametrized Constructor..");
		 this.id=id;
		 this.name=name;
		 this.age=age;
	 }
	 
	 ParametrizedConstructor(){
		 System.out.println("No args Constuctor");
		 id=0;
		 name="Unknown";
		 age=18;
	 }
	 
	 void show() {
		 System.out.println("********************************");
		 System.out.println("Id : "+id);
		 System.out.println("Name : "+name);
		 System.out.println("Age : "+age);
	 }
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		 ParametrizedConstructor p1=new  ParametrizedConstructor();
		 p1.show();
		 
		 ParametrizedConstructor p2=new  ParametrizedConstructor(101,"Lakshman Pala",21);
		 p2.show();
		 
		 ParametrizedConstructor p3=new  ParametrizedConstructor(101,"Lakshman Pala",21);
		 p3.show();
	}
}
