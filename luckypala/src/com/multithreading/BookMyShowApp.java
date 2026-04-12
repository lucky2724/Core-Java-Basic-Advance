package com.multithreading;

class TicketBooking {

	int totalTickets = 10;

	synchronized public void bookMyTickets(int requestedTickets) {
		if (requestedTickets <= totalTickets) {
			System.out.println("Your Tickets are Booked Successfully !!");
			System.out.println("Total Number of Tickets Booked from you is : " + requestedTickets);

			totalTickets -= requestedTickets;
			System.out.println("The Available  Tickets are : " + totalTickets);
		} else {
			System.err.println("Sorry Tickets have SoldOutt !!");
			System.err.println("The only available Tickets are : " + totalTickets);
		}
	}

}

class UserThread extends Thread {
	TicketBooking booking;
	String username;
	int requestedTickets;

	public UserThread(TicketBooking booking, String username, int requestedTickets) {
		super();
		this.booking = booking;
		this.username = username;
		this.requestedTickets = requestedTickets;
	}

	@Override
	public void run() {
		booking.bookMyTickets(requestedTickets);
	}
}

public class BookMyShowApp {
	public static void main(String[] args) {
		System.out.println("main method started");

		TicketBooking booking = new TicketBooking();

		UserThread user1 = new UserThread(booking, "Luckyy", 6);
		UserThread user2 = new UserThread(booking, "Surya", 2);
		UserThread user3 = new UserThread(booking, "Kiran", 5);
		user1.start();
		user2.start();
		user3.start();

		System.out.println("main method eneded");
	}
}
