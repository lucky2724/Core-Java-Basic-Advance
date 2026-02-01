package com.tasks;

public class BankAccount {
	long accountNumber;
	String holderName;
	double balance;
	
	BankAccount(long accountNumber){
		this.accountNumber=accountNumber;
	
	}
	
	BankAccount(long accountNumber,String holderName){
		
		this(accountNumber);
		this.holderName=holderName;
	}
	
	BankAccount(long accountNumber,String holderName,double balance){
		this(accountNumber,holderName);
		this.balance=balance;
	}
	
	void show() {
		System.out.println("===============================");
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+holderName);
		System.out.println("Account Balance : "+balance);
		System.out.println("===============================");
		
	}
	public static void main(String[] args) {
		System.out.println("main method started...");
		
		BankAccount b1=new BankAccount(10011,"Suryaaa",9870.0);
		b1.show();
		
	}
}
