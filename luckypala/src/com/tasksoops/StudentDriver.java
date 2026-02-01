package com.tasksoops;

import java.util.Scanner;

public class StudentDriver {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Id : ");
		int sid = sc.nextInt();

		System.out.println("Enter your name : ");
		String sname = sc.next();

		System.out.println("Enter total Fee amount : ");
		double totalFee = sc.nextDouble();

		System.out.println("Enter How much fee you paid : ");
		double paidFee = sc.nextDouble();

		Student s1 = new Student(sid, sname, totalFee, paidFee);

		System.out.println("Enter amount how much you do pay : ");
		double amount = sc.nextDouble();

		s1.payFee(amount);

		// s1.payFee(8000);

		// System.out.println(s1.getRemainingFee());

		s1.displayFeeStatus();
		
//		s2.payFee(amount);
//		s2.displayFeeStatus();

		sc.close();
	}

}
