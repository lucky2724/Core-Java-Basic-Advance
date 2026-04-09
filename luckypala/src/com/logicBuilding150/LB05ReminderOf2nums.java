package com.logicBuilding150;
import java.util.*;
public class LB05ReminderOf2nums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter a number:");
		int first=sc.nextInt();
		
		System.out.print("Enter a number:");
		int second=sc.nextInt();
		
		int rem=first%second;
		System.out.println("Reminder is:"+rem);
		
		sc.close();
		
	}
}
