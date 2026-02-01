package com.constructors;

public class ConstructorChaining {
	int cid;
	String cname;
	long phone;
	int age;
	
	ConstructorChaining(){
		System.out.println("no arg constructor..");
		this(101);
	}
	
	ConstructorChaining(int cid){
		System.out.println("1 arg constructor..");
		//this.cid=cid;
		this(cid,"Lakshman pala");
	}
	
	ConstructorChaining(int cid,String cname){
		System.out.println("2 arg constructor..");
		//this.cid=cid;
		//this.cname=cname;
		this(cid,cname,9502876688L);
	}
	
	ConstructorChaining(int cid,String cname,long phone){
		System.out.println("3 arg constructor..");
		//this.cid=cid;
		//this.cname=cname;
		//this.phone=phone;
		this(cid,cname,phone,21);
	}
	
	ConstructorChaining(int cid,String cname,long phone,int age){
		System.out.println("4 arg constructor..");
		this.cid=cid;
		this.cname=cname;
		this.phone=phone;
		this.age=age;
	}
	
	
	
	void show() {
		System.out.println("==============================");
		System.out.println("Customer Id : "+cid);
		System.out.println("Customer Name : "+cname);
		System.out.println("Phone Number : "+phone);
		System.out.println("Customer Age : "+age);
		System.out.println("==============================");
	}
	public static void main(String[] args) {
		ConstructorChaining c1=new ConstructorChaining();
		c1.show();
	}
}
