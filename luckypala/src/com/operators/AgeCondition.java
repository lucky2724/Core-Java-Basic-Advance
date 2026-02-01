package com.operators;
import java.util.*;

public class AgeCondition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		
		System.out.println("Enter your nationality : ");
		String nat=sc.next();
		
		if(age>18 && nat.equalsIgnoreCase("india")) {
			System.out.println("Approve Driving Licence");
		}else {
			System.out.println("Not Approved");
		}
		
		sc.close();
	}
}
