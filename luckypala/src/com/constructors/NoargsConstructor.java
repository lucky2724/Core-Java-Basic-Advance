package com.constructors;

public class NoargsConstructor {
	String name;
	int age;
	long mobileNum;
	
	//No args constructor
	NoargsConstructor(){
		//when object was created constructor can be executed
		//with use of no args constructor user can  provide default values 
		System.out.println("======= No args Constructor ========");
		name="Unknown";
		age=18;
		mobileNum=123456789;
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(mobileNum);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		
		NoargsConstructor  s1=new NoargsConstructor();  //Now this is not default constructor this is No args constructor.
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.mobileNum);
		
		
		NoargsConstructor  s2=new NoargsConstructor();
		s2.display();
		
		NoargsConstructor  s3=new NoargsConstructor();
		s3.name="Surya pala";
		s3.age=26;
		s3.mobileNum=7702441586L;
		s3.display();
		
		NoargsConstructor  s4=new NoargsConstructor();
		s4.display();
		
	}
}
