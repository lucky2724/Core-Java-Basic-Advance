package com.loanapp;

public class PersonalLoan extends Loan {

	void getPersonalDocInfo() {
		System.out.println("Personal Loan Documents are submitted Succefullyyyy !!");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Personal Loan Banking !!");

		PersonalLoan pl = new PersonalLoan();

		if (pl.validateAadhar() && pl.validatePan() && pl.validateMobile()) {
			double salary = pl.getSalary();
			int age = pl.getAge();
			int cibil = pl.getCibilScore();

			if (salary >= 1500000.00 && (age >= 22 && age <= 70) && cibil >= 750) {
				System.out.println("Congratulations !! Your Personal Loan get approved !!");
				System.out.println("Your Loan ROI is : " + pl.getLoanROI());
				System.out.println("-- Enter Your address Details -- ");
				System.out.println(pl.getAddress());
				pl.getPersonalDocInfo();
			} else {
				System.out.println("Sorry !! Your loan got Rejected !!");
				System.out.println("You are not eligible with this loan !!");
			}
		} else {
			System.out.println("Your data is incorrect It's not matching with any profile,Provide valid Details !! ");
		}

	}
}
