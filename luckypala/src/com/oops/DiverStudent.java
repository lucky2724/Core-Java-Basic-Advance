package com.oops;

public class DiverStudent {
	public static void main(String[] args) {
		System.out.println("main method started");

		Student s1 = new Student();

		// Stopping the direct access from outside of the classes we use private
		// keyword.
//		s1.sid=100;
//		s1.sname="Surya";
//		s1.sage=25;
//
//		// Accessing the data direct
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.sage);

		//Modifying the data 
		s1.setSid(18);
		s1.setSname("Virat");
		s1.setSage(35);

		//Read the data 
		System.out.println("Id : " + s1.getSid());
		System.out.println("Name : " + s1.getSname());
		System.out.println("Age : " + s1.getSage());
		
		System.out.println();
		
		Student s2 = new Student();
		s2.setSid(45);
		s2.setSname("Rohit");
		s2.setSage(38);

		System.out.println("Id : " + s2.getSid());
		System.out.println("Name : " + s2.getSname());
		System.out.println("Age : " + s2.getSage());
		
		System.out.println();
		
		Student s3 = new Student();
		s3.setSid(07);
		s3.setSname("MSD");
		s3.setSage(50);

		System.out.println("Id : " + s3.getSid());
		System.out.println("Name : " + s3.getSname());
		System.out.println("Age : " + s3.getSage());
	}
}
