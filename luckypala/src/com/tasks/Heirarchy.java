package com.tasks;

class Vehicle{
	String type;
	
	Vehicle(String type){
		this.type=type;
		System.out.println("Vehicle Type : "+type);
	}
}

class Car extends Vehicle{
	String brand;
	
	Car(String type,String brand){
		super(type);
		System.out.println("Car Brand : "+brand);
	}
}

class eCar extends Car{
	int batteryCapacity;
	
	eCar(String type,String brand,int batteryCapacity){
		super(type,brand);
		System.out.println("Ecar Battery capacity : "+batteryCapacity+" 100kwh");
	}
	
}

public class Heirarchy {
	public static void main(String[] args) {
		System.out.println("main method started..");
		
		eCar e1=new eCar("Four wheeler","Tesla",100);
		System.out.println(e1.type);
	}
}
