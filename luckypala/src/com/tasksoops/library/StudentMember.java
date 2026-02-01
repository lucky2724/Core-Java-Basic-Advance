package com.tasksoops.library;

public class StudentMember extends LibraryMember {

	@Override
	public double calculateFee() {
		return getBorrowedBooks() * 10;
	}

}
