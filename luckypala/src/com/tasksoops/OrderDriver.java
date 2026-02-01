package com.tasksoops;

public class OrderDriver {
	public static void main(String[] args) {
		Order o1 = new Order(101, "Biryani", 2, 250);

		o1.orderStatus("Cancel");

		o1.getOrderDetails();
		
		Order o2 = new Order(102, "Thandhoori-Chicken", 3, 150);

		o2.orderStatus("placed");

		o2.getOrderDetails();
	}
}
