package com.logicalstatements;

import java.util.Scanner;

public class SwitchCase02 {
	public static void main(String[] args) {
		System.out.println("main method started...");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a day number 1-7 : ");
		int n=sc.nextInt();
		
		switch(n) {
			case 1->{
					System.out.println("SUNDAY");
					System.out.println("Sunday is Fun day !!");
					}
			case 2->{
					System.out.println("MONDAY");
					System.out.println("Work Start....");;
					}
			case 3->System.out.println("TUESDAY");
			case 4->System.out.println("WEDNESDAY");
			case 5->System.out.println("THURSDAY");
			case 6->{
					System.out.println("FRIDAY");
					System.out.println("Weeked Start ... Ewwww..!");
					}
			case 7->System.out.println("SATURDAY");
			default -> {
						System.out.println("INVALID DAY !!"); 
						System.out.println("Please try again...");
						}
		}
		
		sc.close();
	}
}
