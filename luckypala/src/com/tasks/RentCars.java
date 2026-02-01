package com.tasks;
import java.util.Scanner;
public class RentCars {
	String getName(String name) {
		return name;
	}
	
	double getDailyPrice(double price) {
		return price;
	}
	
	double getInsurance(double insurance) {
		return insurance;
	}
	
	double baseCost(int days,double price) {
		double dailyPrice=getDailyPrice(price);
		return days*dailyPrice;
	}
	
	
	
	
	 void main(String[] args) {
		System.out.println("main nethod started..");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Car name:");
		String cName=sc.nextLine();
		
		System.out.println("Enter daily price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter insurance:");
		double insurance=sc.nextDouble();
		
		System.out.println("Enter number of days car rented:");
		int days=sc.nextInt();
		
		double totalCost=baseCost(days,price)+getInsurance(insurance);
		
		System.out.println("======== Rent Cars ========");
		System.out.println("Car Name : "+getName(cName));
		System.out.println("Price per day : "+getDailyPrice(price));
		System.out.println("Insurance : "+getInsurance(insurance));
		System.out.println("Base Cost : "+baseCost(days,price));
		System.out.println("Total cost : "+totalCost);
		
		sc.close();
	}
}
