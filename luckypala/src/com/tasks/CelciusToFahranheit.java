package com.tasks;

public class CelciusToFahranheit {
	public static void main(String[] args) {
		int celcius=40;
		double cToFahranheit=(celcius*9/5)+32;
		
		System.out.println("=========== Celcius to Fahranheit ==========");
		System.out.println("Celcius Value : "+celcius);
		System.out.println("Convert celcius to fahranheit : "+cToFahranheit);
		
		
		System.out.println("=========== Fahranheit to celcius ===========");
		double fahranheit=106.9;
		int fToCelcius=(int)(fahranheit-32)*5/9;
		System.out.println("Fahranheit value : "+fahranheit);
		System.out.println("Convert fahrenheit to Celcius : "+fToCelcius);
		
	
	}
}
