package com.tasksoops;

public class Order {
	private int orderId;
	private String itemName;
	private int quantity;
	private String orderStatus = "placed";
	private double price;

	public Order(int orderId, String itemName, int quantity, double price) {
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}

	public void setQuantity(int qty) {
		if (qty > 0) {
			quantity += qty;
		}
	}

	public void setOrderStatus() {
		orderStatus = "cancle";
	}

	public String orderStatus(String s) {
		if (s.equalsIgnoreCase("placed")) {
			orderStatus = "Placed";
		} else {
			orderStatus = "Order Cancel";
		}
		return orderStatus;
	}

	public void getOrderDetails() {
		System.out.println("==========================");
		System.out.println("Order Id     : " + orderId);
		System.out.println("Item Name    : " + itemName);
		System.out.println("Quantity     : " + quantity);
		System.out.println("Order Status : " + orderStatus);
		if (orderStatus.equalsIgnoreCase("placed")) {
			System.out.println("Price 	     : " + quantity * price);
		} else {
			System.out.println("Price 	     : " + 0.00);
		}
		System.out.println("==========================");
	}

}
