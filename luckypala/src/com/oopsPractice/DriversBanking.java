package com.oopsPractice;

import java.util.Scanner;

public class DriversBanking {
	public static void main(String[] args) {
		System.out.println("mainn method started..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = sc.next();

		System.out.println("Enter your account Number : ");
		int acNum = sc.nextInt();

		System.out.println("Enter your Initial Balance : ");
		double balance = sc.nextDouble();

		BankTransactions b1 = new BankTransactions(name, acNum, balance);

		int choice = 0;

		do {

			System.out.println("====== Banking System =======");
			System.out.println("1.check Balance");
			System.out.println("2.Deposite");
			System.out.println("3.Withdraw");
			System.out.println("4.Account Details");
			System.out.println("5.Exit");

			System.out.println("Enter your choice (1-5) : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1 -> b1.getBalance();

			case 2 -> {
				System.out.println("Enter your Deposite Money : ");
				double deposite = sc.nextDouble();
				b1.deposite(deposite);
			}
			case 3 -> {
				System.out.println("Enter Your WithDrawl Money : ");
				double withdrawl = sc.nextDouble();
				b1.withdraw(withdrawl);
			}
			case 4 -> b1.viewDetails();
			case 5 -> System.out.println("Thanks for Using my Bank !! Visit again..!!");
			default -> System.out.println("Invalid Choice X !! Enter a Valid choice..!!");
			}

		} while (choice != 5);

		sc.close();

	}

}
