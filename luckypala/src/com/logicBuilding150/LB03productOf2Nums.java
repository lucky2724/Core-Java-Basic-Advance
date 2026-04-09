package com.logicBuilding150;
import java.util.*;
public class LB03productOf2Nums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter a number:");
		int first=sc.nextInt();
		
		System.out.print("Enter a number:");
		int second=sc.nextInt();
		
		int product=first*second;
		System.out.println("product is:"+product);
		
		sc.close();
	}
}
