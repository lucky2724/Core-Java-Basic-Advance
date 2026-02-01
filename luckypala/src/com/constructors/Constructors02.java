package com.constructors;

public class Constructors02 {
	int eid;
	String ename;
	double esal;
	
	Constructors02(){
		System.out.println("no-arg Constructor.. ");
		eid=100;
		ename="Unknown";
		esal=1000.00;
	}
	
	Constructors02(int eid,String ename,double esal){
		System.out.println("parameterized Constructor..");
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void show() {
		System.out.println("***************************");
		System.out.println("Employee Id  : "+eid);
		System.out.println("Emplyee Name : "+ename);
		System.out.println("Salary       : "+esal);
		System.out.println("***************************");
	}
	
	public static void main(String[] args) {
		//Parameterized Constructor
		System.out.println("main method started..");
		
		Constructors02 c1=new Constructors02();
		c1.show();
		
		Constructors02 c2=new Constructors02(101,"Luckyyy",2000);
		c2.show();
	}
}
