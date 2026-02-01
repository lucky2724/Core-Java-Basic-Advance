package com.loanapp;

public class CarLoan extends Loan {
	void display() {
		System.out.println("Child class called !!");
	}

	@Override
	public void hello() {
		System.out.println("java is simple !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started...");

		System.out.println("=== Child object and child reference ===");
		// child reference child object
		CarLoan cl = new CarLoan();
		cl.display();// child class functionalities
		cl.hello();// parent class functinalities

		System.out.println("=== Parent object and Parent reference ===");
		// parent reference parent object
		Loan l = new Loan();
		l.hello();
		// l.display(); //child class cant't called

		System.out.println("=== Child object and Parent reference ===");
		// parent reference child object
		Loan l1 = new CarLoan();
		l1.hello();
		// l1.display(); //can't access

		System.out.println("=== Parent object and child reference ===");
		// child reference Parent object
		//CarLoan cl = new Loan(); // NOT POSSIBLE
		System.out.println("not possible");
	}
}
