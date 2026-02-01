package com.tasks;

public class User {

	 @SuppressWarnings("unused")
	 void main() {
		int amount=100;
		int itemCost=8;
		
		int totalItems=100/8;
		int remain=100%8;
		
		System.out.println();
		System.out.println("Total Items:"+totalItems);
		System.out.println("Total Cost:"+totalItems*itemCost);
		System.out.println("Remaining Cost:"+remain);
		
	}

}
