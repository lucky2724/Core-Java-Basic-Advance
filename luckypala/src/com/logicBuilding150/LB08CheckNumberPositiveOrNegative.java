package com.logicBuilding150;
import java.util.*;
public class LB08CheckNumberPositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=sc.nextInt();
		
		if(n<0) {
			System.out.println(n+" is negatiive");
		}else {
			System.out.println(n+" is positive");
		}
		
		sc.close();
	}

}
