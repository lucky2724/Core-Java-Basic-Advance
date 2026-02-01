package com.casestudy;

public class HotelRoomBooking {
	private int roomNumber;
	private String guestName;
	private String roomType;
	private double roomPrice;
	private boolean isBooked;

	public void setRoomNumber(int roomNumber) {
		if (roomNumber > 0) {
			this.roomNumber = roomNumber;
		} else {
			System.out.println("Invalid Room Number !!");
		}
	}

	public void setGuestName(String guestName) {
		if (guestName != null && !guestName.isEmpty()) {
			this.guestName = guestName;
		} else {
			System.out.println("Invalid Guest Name !!");
		}
	}

	public void setRoomType(String roomType) {
		if (roomType.equalsIgnoreCase("standard")) {
			this.roomType = roomType;
			this.roomPrice = 2000;
		} else if (roomType.equalsIgnoreCase("Delux")) {
			this.roomType = roomType;
			this.roomPrice = 3500;
		} else {
			System.out.println("Invalid Room type !!");
		}
	}

	public void bookRoom() {
		if (!isBooked) {
			isBooked = true;
			System.out.println("Room is Succesfully Booked !!");
		} else {
			System.out.println("Sorry !! Room is Already booked !!");
		}
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getGuestName() {
		return guestName;
	}

	public String getRoomType() {
		return roomType;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public String bookingStatus() {
		if (isBooked) {
			return "Yes";
		}

		return "No";
	}

}
