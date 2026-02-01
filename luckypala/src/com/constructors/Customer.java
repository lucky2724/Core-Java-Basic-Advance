package com.constructors;

public class Customer {
	int cid;
	String cname;
	String address;
	double amount;
	boolean isPay;
	
	Customer(String cname){
		this.cname=cname;
	}
	
	Customer(Customer c1,int cid){
		this.cid=cid;
		this.cname=c1.cname;
	}
	
	Customer(Customer c2,boolean isPay){
		this.isPay=isPay;
		this.cname=c2.cname;
		this.cid=c2.cid;
	}
	
	Customer(Customer c3,double amount){
		this.amount=amount;
		this.isPay=c3.isPay;
		this.cname=c3.cname;
		this.cid=c3.cid;
	}
	
	Customer(Customer c4,String address){
		this.address=address;
		this.amount=c4.amount;
		this.isPay=c4.isPay;
		this.cname=c4.cname;
		this.cid=c4.cid;
	}
	
	
	void show() {
		System.out.println("=================================");
		System.out.println("Customer Id       : "+cid);
		System.out.println("Customer Name     : "+cname);
		System.out.println("Customer Address  : "+address);
		System.out.println("Total Amount      : "+amount);
		System.out.println("isPay(true/false) : "+isPay);
		System.out.println("=================================");
	}
	public static void main(String[] args) {
		System.out.println("main method started..");
		
		Customer c1=new Customer("Afrin");
		c1.show();
		
		Customer c2=new Customer(c1,101);
		c2.show();
		
		Customer c3=new Customer(c2,true);
		c3.show();
		
		Customer c4=new Customer(c3,985.45);
		c4.show();
		
		Customer c5=new Customer(c4,"Hyderbad");
		c5.show();
		
	}
}
