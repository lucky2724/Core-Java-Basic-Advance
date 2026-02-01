package com.operators;

import java.util.Scanner;

public class GradeTakerTernary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		String name = sc.next();
		
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		System.out.println("Name : " + name);
		System.out.println("Your marks : " + marks);

		char grade = (marks >= 90) ? 'A' : ((marks >= 80) ? 'B' : ((marks >= 70) ? 'C' : ((marks >= 60) ? 'D' : 'F')));

		String result = grade + " - " + ((marks >= 60) ? "Pass" : "Fail");

		System.out.println("Your Grade : " + grade);
		System.out.println("Result : " + result);

		sc.close();
	}
}
