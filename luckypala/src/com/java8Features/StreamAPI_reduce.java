package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_reduce {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		//Sum of Numbers
		 List<Integer> list =
	                Arrays.asList(1,2,3,4);

	        int sum =
	                list.stream()
	                    .reduce(0, (a,b) -> a+b);

	        System.out.println("Sum of Numbers : "+sum);
	        
	        
	     //Product of Numbers 
	        List<Integer> list1 =
	                Arrays.asList(1,2,3,4);

	        int product =
	                list1.stream()
	                    .reduce(1, (a,b) -> a*b);
	        
	        
	        //Max Value
	        System.out.println("Product of Numbers : "+product);
	        
	        List<Integer> list3 =
	                Arrays.asList(10,50,20,40);

	        int max =
	                list3.stream()
	                    .reduce(Integer.MIN_VALUE,
	                            (a,b) -> a>b ? a:b);

	        System.out.println("Max : "+max);
	        
	        //Min Value
	        int min =
	                list3.stream()
	                    .reduce(Integer.MAX_VALUE,
	                            (a,b) -> a<b ? a:b);
	        
	        System.out.println("Min : "+min);
	}
}
