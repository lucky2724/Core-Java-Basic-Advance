package com.tasksoops.library;

public class PremiumMember extends LibraryMember {

	@Override
	public double calculateFee() {
		return getBorrowedBooks() * 5;
	}

}
