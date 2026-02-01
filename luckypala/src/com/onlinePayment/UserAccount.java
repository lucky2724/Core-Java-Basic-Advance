package com.onlinePayment;

//Abstract class - Abstraction

abstract class Payment {
	abstract void pay(double amount, UserAccount user);
}

public class UserAccount {
	private String name;
	private double balance;

	public UserAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deductBalance(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

}
