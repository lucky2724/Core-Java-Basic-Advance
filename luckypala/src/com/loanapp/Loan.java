package com.loanapp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	// ==================== Address Validation ========================
	String getAddress() {
		String address = "";

		System.out.println("Enter Your flat Number : ");
		String flat = sc.next();

		System.out.println("Enter Your Street Name : ");
		String street = sc.next();

		System.out.println("Enter Your City : ");
		String city = sc.next();

		System.out.println("Enter Your PINCODE : ");
		String pin = sc.next();

		String pinRegEX = "[5][0-9]{5}";

		if (!Pattern.matches(pinRegEX, pin)) {
			System.out.println("Enter Valid PinCode !!");
		} else {
			System.out.println("=== Check Your Address Details ===");
			address = "flat Num - " + flat + ", Street - " + street + ", City -  " + city + ", PINCODE : " + pin;
		}

		return address;
	}

	// ==================== Aadhar Validation ========================
	boolean validateAadhar() {
		System.out.println("Enter Your Aadhar Number : ");
		String aadhar = sc.next();

		String aadharRegEX = "^[2-9][0-9]{11}$";

		return Pattern.matches(aadharRegEX, aadhar);
	}

	// ==================== PAN Validation ========================
	boolean validatePan() {
		System.out.println("Enter Your PAN card Number : ");
		String pan = sc.next();

		String panRegEx = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$";

		return Pattern.matches(panRegEx, pan);
	}

	// ==================== Mobile number Validation ========================
	boolean validateMobile() {
		System.out.println("Enter Your Mobile Number : ");
		String mobile = sc.next();

		String mobileRegEx = "^[6-9][0-9]{9}$";

		return Pattern.matches(mobileRegEx, mobile);
	}

	// ==================== Age Validation ========================
	int getAge() {
		System.out.println("Enter Your age : ");
		int age = sc.nextInt();

		return age;

	}

	// ==================== Loan Info ========================
	double getLoanROI() {
		return 12.5;
	}

	// ==================== Cibil Score Validation ========================
	int getCibilScore() {
		System.out.println("Enter Your Cibil Score : ");
		int cibil = sc.nextInt();

		return cibil;
	}

	// ==================== Salary Validation ========================
	double getSalary() {
		System.out.println("Enter Your Salary : ");
		double sal = sc.nextDouble();

		return sal;
	}

	// hello
	public void hello() {
		System.out.println("Parent class called !!");
	}

}
