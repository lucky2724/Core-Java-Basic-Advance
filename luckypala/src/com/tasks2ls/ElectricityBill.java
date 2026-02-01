package com.tasks2ls;

public class ElectricityBill {
	String name;
	int units;
	double billAmount;

	ElectricityBill(String name, int units) {
		this.name = name;
		this.units = units;
		if (units > 600) {
			billAmount = units * 6;
		} else if (units > 500) {
			billAmount = units * 4;
		} else if (units > 300) {
			billAmount = units * 2.5;
		} else if (units > 100) {
			billAmount = units * 1.5;
		} else if (units >= 0 && units <= 100) {
			billAmount = units * 1;
		}

		if (billAmount > 2000) {
			double surcharge = billAmount * 1 / 10;
			billAmount += surcharge;
		}

	}
	
	ElectricityBill(String name){
		this.name=name;
		units=0;
		System.out.println("Consumption Recorded !!");
	}

	void display() {
		System.out.println("====== Bill Summaryy =====");
		System.out.println("Name 		: " + name);
		System.out.println("Units 		: " + units);
		System.out.println("Bill Amount : ₹" + billAmount);
		System.out.println("==========================");
	}

	public static void main(String[] args) {
		System.out.println("main method started ...");

		ElectricityBill e1 = new ElectricityBill("Luckyy", 102);
		e1.display(); // 153
		ElectricityBill e2 = new ElectricityBill("Suryaa", 405);
		e2.display(); // 1012
		ElectricityBill e3 = new ElectricityBill("Sai", 650);
		e3.display(); //
		ElectricityBill e4 = new ElectricityBill("Tharun");
		e4.display();
		
	} 
}
