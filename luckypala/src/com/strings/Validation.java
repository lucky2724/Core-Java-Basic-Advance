package com.strings;

public class Validation {
	public static void main(String[] args) {
		System.out.println("main method started");

		String phn = "9502876688";

		if (phn.matches("^[6-9][0-9]{9}$")) {
			System.out.println(phn + " is Valid Phone Number ..");
		} else {
			System.out.println("Not a Valid phone Numbver..");
		}
		
		

		String aadhaar = "522578467641";
		if (aadhaar.matches("^[0-9]{12}$")) {
			System.out.println(aadhaar + " is a Valid Aadhaar");
		} else {
			System.out.println("Not a Valid Aadhar ");
		}

		String pan = "PUQKR5672H";
		if (pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]$")) {
			System.out.println(pan + " is a Valid PAN");
		} else {
			System.out.println("Not a Valid pan");
		}
	}
}
