package com.tasks;
import java.util.Scanner;

public class Bank {
	
	static String  branchName;
	static String ifsc;
	
	long accountNumber(long acNum) {
		return acNum;
	}
	
	String accountHolderName(String name) {
		return name;
	}
	
	double depositeAmount(double deposite) {
		return deposite;
	}
	
	double savingsAmount(double amount) {
		return amount;
	}
	
	
	 void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Branch Name:");
		branchName=sc.nextLine();
		
		System.out.println("Enter IFSC code:");
		ifsc=sc.nextLine();
		
		System.out.println("Enter your Account number:");
		long acNum=sc.nextLong();
		
		sc.nextLine();
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your deposite amount:");
		double damount=sc.nextDouble();
		
		System.out.println("Enter your Savings amount:");
		double sAmount=sc.nextDouble();
		
		
		long accountNum=accountNumber(acNum);
		String accountHolderName=accountHolderName(name);
		double depAm=depositeAmount(damount);
		double savings=savingsAmount(sAmount);
		
		double totalAmount=savings+depAm;
		
		System.out.println("====== Account Details =======");
		System.out.println("Branch Name: "+branchName);
		System.out.println("IFSC Code: "+ifsc);
		System.out.println("Account Number: "+accountNum);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Deposite Amount: "+depAm);
		System.out.println("Savings Amount: "+sAmount);
		System.out.println("Total amount after deposite: "+totalAmount);
		
		sc.close();
		
	}
}
