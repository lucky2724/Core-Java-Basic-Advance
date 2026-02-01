package com.tasksoops;

import java.util.Scanner;

public class Student {
	static Scanner sc = new Scanner(System.in);

	private int sid;
	private String sname;
	private double totalFee;
	private double paidFee;

	public Student(int sid, String sname, double totalFee, double paidFee) {
		this.sid = sid;
		this.sname = sname;
		this.totalFee = totalFee;
		this.paidFee = paidFee;
	}

	double remainingFee = 0;

	public void payFee(double amount) {
		if (amount < 0 || paidFee + amount > totalFee) {
			System.out.println("Invalid Amount !!");
		} else {
			paidFee += amount;
			System.out.println();
			System.out.println("Fee $" + amount + " paid SuccessFullyy!!! ");
			System.out.println("Remaining Due : " + (totalFee - paidFee));
			System.out.println();
		}
	}

	public double getRemainingFee() {
		return totalFee - paidFee;
	}

	public void displayFeeStatus() {
		System.out.println("=================================");
		System.out.println("Student Id : " + sid);
		System.out.println("Student Name : " + sname);
		System.out.println("Total Fee : " + totalFee);
		System.out.println("Paid Fee : " + paidFee);
		System.out.println("Remaining Fee : " + getRemainingFee());
		System.out.println("=================================");
	}

}
