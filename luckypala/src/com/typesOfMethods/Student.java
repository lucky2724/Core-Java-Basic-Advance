package com.typesOfMethods;
import java.util.Scanner;
public class Student {
	
	void getInfo(int id) {
		System.out.println("Student id :"+id);
	}
	
	void getName(String fname,String lname) {
		System.out.println("Student name:"+lname+" "+fname);
	}
	
	void phn(long phn) {
		System.out.println("Student phone num:"+phn);
	
	}
	
	void height(float height) {
		System.out.println("Student Height:"+height);
	}
	
	void weight(double weight) {
		System.out.println("Student weight:"+weight);
	}
	
	void marriageStatus(boolean isStatus) {
		System.out.println("Marriage status is:"+isStatus);
	}
	
	void genderInfo(char ch) {
		System.out.println("Gender:"+ch);
	}
	
	void main() {
		System.out.println("main method started...");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your first name:");
		String fname=sc.nextLine();
		
		System.out.println("Enter your last name:");
		String lname=sc.next();
		
		System.out.println("Enter your phone num:");
		long phn=sc.nextLong();
		
		System.out.println("Enter your height:");
		float height=sc.nextFloat();
		
		System.out.println("Enter your weight:");
		double weight=sc.nextDouble();
		
		System.out.println("Enter your marriage status:");
		boolean isStatus=sc.nextBoolean();
		
		System.out.println("Enter your gender Info:");
		char ch=sc.next().charAt(0);
		
		
		System.out.println("========= Student details =========");
		System.out.println("************************");
		getInfo(id);
		getName(fname,lname);
		phn(phn);
		height(height);
		weight(weight);
		marriageStatus(isStatus);
		genderInfo(ch);
		System.out.println("***********************");
		sc.close();
	}
}
