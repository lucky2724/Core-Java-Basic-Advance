package com.logicBuilding150;
import java.util.*;
public class LB12CheckNumisDivisibleBy2And3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		
		if(num%2==0 && num%3==0) {
			System.out.println(num+" is divisible by 2 and 3");
		}else {
			System.out.println(num+" is not divisible by 2 and 3");
		}
		sc.close();
	}
}
