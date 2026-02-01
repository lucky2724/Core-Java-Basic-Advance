package com.loanapp;

public class HomeLoan extends Loan {
	void getDocDetails() {
		System.out.println("Your Home Loan Doucuments are Submitted Successfull!!");
	}

	public static void main(String[] args) {
		System.out.println("==== Welcome to Lucky Home Loan !! ====");

		HomeLoan hl = new HomeLoan();

		if (hl.validateAadhar() && hl.validatePan() && hl.validateMobile()) {
			double salary = hl.getSalary();
			int age = hl.getAge();
			int cibil = hl.getCibilScore();

			if (salary >= 1500000.00 && (age >= 22 && age <= 70) && cibil >= 750) {
				System.out.println("Congratulations !! Your Home Loan get approved !!");
				System.out.println("Your Loan ROI is : " + hl.getLoanROI());
				System.out.println("-- Enter Your address Details -- ");
				System.out.println(hl.getAddress());
				hl.getDocDetails();
			} else {
				System.out.println("Sorry !! Your Home loan got Rejected !!");
				System.out.println("You are not eligible with this loan !!");
			}
		} else {
			System.out.println("Your data is incorrect It's not matching with any profile,Provide valid Details !! ");
		}
	}
}
