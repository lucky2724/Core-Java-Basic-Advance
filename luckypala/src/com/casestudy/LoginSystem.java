package com.casestudy;

import java.util.Scanner;

public class LoginSystem {
	public static void main(String[] args) {
		System.out.println("main method started...");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Enter Correct Password within 3 Attempts ======");

		String pw = "";

		int count = 0;

		do {
			System.out.println("Enter your PassWord : ");
			pw = sc.next();

			count++;

			if (pw.equals("java123")) {
				System.out.println("Access Granted !!");
				break;
			}

			if (count == 3) {
				System.out.println("Account Locked !!");
			}

		} while (!pw.equals("java123") && count!=3);

		sc.close();
	}
}
