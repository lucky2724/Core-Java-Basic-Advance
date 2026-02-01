package com.onlinePayment;

public class NetBankingPayment extends Payment {

	@Override
	void pay(double amount, UserAccount user) {
		System.out.println("----- Payment Method -> NET BANKING -----");

		if (user.deductBalance(amount)) {
			System.out.println("Transaction Successful !!");
			System.out.println("Paid Amount       : ₹" + amount);
			System.out.println("Remaining Balance : ₹" + user.getBalance());
		} else {
			System.err.println("Transaction Failed: Insufficient Balance");
		}
	}
}
