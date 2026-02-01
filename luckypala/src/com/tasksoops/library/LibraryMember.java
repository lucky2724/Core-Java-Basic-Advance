package com.tasksoops.library;

public class LibraryMember {
	private String memberName;
	private String bookName;
	private int borrowedBooks;

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBorrowedBooks(int borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}

	public int getBorrowedBooks() {
		return borrowedBooks;
	}

	public double calculateFee() {
		return borrowedBooks;
	}

}
