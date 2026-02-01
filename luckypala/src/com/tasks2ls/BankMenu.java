package com.tasks2ls;

import java.util.Scanner;

public class BankMenu {

	void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();

		System.out.println("Enter your Balance : ");
		double balance = sc.nextDouble();

		int choice;

		do {
			System.out.println("====== Bank Menu =====");
			System.out.println("1.Check balance");
			System.out.println("2.Deposite Money");
			System.out.println("3.withdrawl Money");
			System.out.println("4.Account Info");
			System.out.println("5.Exit");

			System.out.println("Enter your choice (1-5) : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> {
				IO.println("Your balance is : " + balance);
			}
			case 2 -> {
				IO.println("Enter your Deposite Amount : ");
				double deposite = sc.nextDouble();
				balance += deposite;
				IO.println("₹" + deposite + "/- Deposite Successfully !!");
				IO.println("Your Remaining Balance is : ₹" + balance);
			}
			case 3 -> {
				System.out.println("Enter withdrawl Amount : ");
				double withdrawl = sc.nextDouble();
				if (withdrawl > balance) {
					System.out.println("Insufficient funds !!");
				} else {
					balance -= withdrawl;
					IO.println("₹" + withdrawl + "/- Withdrwan Successfully !!");
					IO.println("Your remaining balance is : ₹" + balance);
				}
			}
			case 5 -> {
				IO.println("Thanks for using !! Please visit Again !!");
			}
			case 4 -> {
				System.out.println("===== User Details ======");
				System.out.println("Holder Name : " + name);
				System.out.println("Balance : ₹" + balance);
			}
			default -> IO.println("Enter Invalid Choice !!");
			}
		} while (choice != 5);

		sc.close();

	}
}
