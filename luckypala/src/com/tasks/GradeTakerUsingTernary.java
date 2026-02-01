package com.tasks;

import java.util.Scanner;

public class GradeTakerUsingTernary {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		
		if(marks>100 || marks<0) {
			System.out.println("Enter valid marks !!!");
			return;
		}

		char grade = (marks >= 90) ? 'A' : ((marks >= 80) ? 'B' : ((marks >= 70) ? 'C' : ((marks >= 60) ? 'D' : 'F')));
		
		String result=(marks>=60)?"Pass":"Fail";
		
		System.out.println("Grade : "+grade+" - "+result);
		
		sc.close();

	}
}
