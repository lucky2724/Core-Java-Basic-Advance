package com.constructors;

public class DefaultConstructor {
	String name;
	int age;
	long mobileNum;
	public static void main(String[] args) {
		//If you dont write any constructor in your class Java automatically provides default constructor.
		//It initializes object fields to default value
		
		//This is default constructor
		DefaultConstructor d1=new DefaultConstructor();
		System.out.println(d1.name);  //default values should be  print..
		System.out.println(d1.age);
		System.out.println(d1.mobileNum);
		
		
	}
}
