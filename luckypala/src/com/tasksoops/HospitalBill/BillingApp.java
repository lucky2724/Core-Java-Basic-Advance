package com.tasksoops.HospitalBill;

import java.util.Scanner;

public class BillingApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Patient pd = new Patient();

		System.out.println("Enter Your Patient Id : ");
		pd.setPatientId(sc.nextInt());

		sc.nextLine();
		System.out.println("Enter Patient Name : ");
		pd.setName(sc.nextLine());

		System.out.println("Enter Number Of days Admied : ");
		pd.setDaysAdmitted(sc.nextInt());

		System.out.println("Enter Price Per day : ");
		pd.setDailyCharges(sc.nextDouble());

		System.out.println("Enter Patient Medicine Charges : ");
		pd.setMedicineCharges(sc.nextDouble());

		System.out.println("======= Patient Billing Details =======");
		System.out.println("Patient Id     : " + pd.getPatientId());
		System.out.println("Patinet Name   : " + pd.getName());
		System.out.println("Days Admitted  : " + pd.getDaysAdmitted());
		System.out.println("Daily Charge   : ₹" + pd.getDailyCharges());
		System.out.println("Medice Chages  : ₹" + pd.getMedicineCharges());
		System.out.println("Original Bill  : ₹" + pd.calculateBill());
		System.out.println("Discount Price : ₹" + pd.calculateDiscount());
		System.out.println("After Discount Price : ₹" + pd.displayBill());

		sc.close();
	}
}
