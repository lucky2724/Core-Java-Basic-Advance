package com.casestudy;

import java.util.Scanner;

public class BankMenu {
	public static void main(String[] args) {
		System.out.println("main method started ..");
		Scanner sc = new Scanner(System.in);

		double balance = 5000;

		System.out.println("Enter your name : ");
		String name = sc.next();

		System.out.println("Hello Mr/miss " + name);
		System.out.println("===== Bank Menu System =====");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposite Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Exit");

		System.out.println("Enter Your Choice (1-4) : ");
		int choice = sc.nextInt();

		switch (choice) {
		case 1 -> {
			System.out.println("Your Current Balance is $" + balance);
			System.out.println("Thank You !!!");
		}
		case 2 -> {
			System.out.println("Enter Your Deposite amount : ");
			double deposite = sc.nextDouble();
			balance += deposite;
			System.out.println("$" + deposite + " Deposite Successfully !!! ");
			System.out.println("Your Updated Balance is : " + balance);
		}
		case 3 -> {
			System.out.println("Enter Your withdrawn amount : ");
			double withdraw = sc.nextDouble();

			if (withdraw > balance) {
				System.out.println("InSufficient Balance !!");
			} else {
				balance -= withdraw;
				System.out.println("$" + withdraw + " Withdrawn Successfully !!! ");
				System.out.println("Your Remaining Balnce is : " + balance);
			}

		}
		case 4 -> {
			System.out.println("Thank You for Using my Bank...");
		}
		default -> System.out.println("Invalid Choice !!");
		}

		sc.close();

	}
}
