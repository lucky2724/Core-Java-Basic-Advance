package com.onlinePayment;

import java.util.Scanner;

public class OnlinePaymentSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your name : ");
		String name = sc.nextLine();

		System.out.println("Enter Your Initial Balance :");
		double balance = sc.nextInt();

		UserAccount u = new UserAccount(name, balance);

		System.out.println("=====> ONLINE PAYMENT SYSTEM <=====");
		System.out.println();
		System.out.println("User Name : " + u.getName());
		System.out.println("Initial Balance : ₹" + u.getBalance());

		System.out.println("Enter Amount to withdraw using UPI : ");
		double upiAmt = sc.nextDouble();
		// Payment class abstract
		Payment payment;
		System.out.println();
		payment = new UPIPayment();
		payment.pay(upiAmt, u);

		System.out.println();
		
		System.out.println("Enter Amount to withdraw using CARD : ");
		double cardAmt = sc.nextDouble();
		payment = new CardPayment();
		payment.pay(cardAmt, u);

		System.out.println();
		
		System.out.println("Enter Amount to withdraw using UPI : ");
		double netbAmt = sc.nextDouble();
		payment = new NetBankingPayment();
		payment.pay(netbAmt, u);

		sc.close();

	}
}
