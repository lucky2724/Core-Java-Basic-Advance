package com.oopsPractice;

public class BankTransactions {
	private String name;
	private int acNum;
	private double balance;

	BankTransactions(String name, int acNum, double balance) {
		this.name = name;
		this.acNum = acNum;
		this.balance = balance;
	}

	public void getBalance() {
		System.out.println("Your Balance : " + balance);
	}

	public void deposite(double deposite) {
		if (balance > 0) {
			balance += deposite;
			System.out.println(deposite + "$ Deposite Successfullyy!!");
			System.out.println("Your Balance After Deposite : " + balance);
		}

	}

	public void withdraw(double withdraw) {
		if (withdraw <= balance) {
			balance -= withdraw;
			System.out.println(withdraw + "$ withdrawn Successfully!!");
			System.out.println("Your Balance After Withdraw : " + balance);
		} else {
			System.out.println("InSufficient funds !!!");
		}
	}

	public void viewDetails() {
		System.out.println("====== Account Details ======");
		System.out.println("User Name : " + name);
		System.out.println("Account Number : " + acNum);
		System.out.println("Initial balance : " + balance);
	}
}
