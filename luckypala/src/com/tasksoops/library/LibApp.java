package com.tasksoops.library;

public class LibApp {
	public static void main(String[] args) {

		StudentMember sm = new StudentMember();
		sm.setMemberName("Luckyyy");
		sm.setBookName("Java Programming");
		sm.setBorrowedBooks(3);

		System.out.println("===== Student Member detatils ======");
		System.out.println("Name  : " + sm.getMemberName());
		System.out.println("Book  : " + sm.getBookName());
		System.out.println("Borrowed Books : " + sm.getBorrowedBooks());
		System.out.println("Price Per Book : $10.0/-");
		System.out.println("Total Fee : $" + sm.calculateFee());
		System.out.println("--------------------------------------");

		PremiumMember pm = new PremiumMember();
		pm.setMemberName("Koteswar");
		pm.setBookName("Data Structures");
		pm.setBorrowedBooks(3);
		
		System.out.println("===== Premium Member details  ======");
		System.out.println("Name  : " + pm.getMemberName());
		System.out.println("Book  : " + pm.getBookName());
		System.out.println("Borrowed Books : " + pm.getBorrowedBooks());
		System.out.println("Price Per Book : $5.0/-");
		System.out.println("Total Fee : $" + pm.calculateFee());
		System.out.println("--------------------------------------");

	}

}
