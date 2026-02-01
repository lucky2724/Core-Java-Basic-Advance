package com.casestudy;

import java.util.Scanner;

public class HotelRoomBookingDriver {
	public static void main(String[] args) {
		HotelRoomBooking h1 = new HotelRoomBooking();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Room number : ");
		h1.setRoomNumber(sc.nextInt());
		sc.nextLine();

		System.out.println("Enter Guest Name : ");
		h1.setGuestName(sc.nextLine());

		System.out.println("Enter room type : ");
		h1.setRoomType(sc.nextLine());

		h1.bookRoom();

		System.out.println("======= Room Details =======");
		System.out.println("Room Number : " + h1.getRoomNumber());
		System.out.println("Guest Name  : " + h1.getGuestName());
		System.out.println("Room Type   : " + h1.getRoomType());
		System.out.println("Room Price  : " + h1.getRoomPrice());
		System.out.println("Booking Status : " + h1.bookingStatus());
		System.out.println("=============================");

		sc.close();

	}
}
