package com.typesOfMethods;
import java.util.Scanner;

public class WithReturnWithargs {
	//With return type with args
	
	//Area of ractangle
	int areaOfRectangle(int length,int breadth) {
		//Area of rectange=length*breadth;
		return length*breadth;
	}
	
	//Area of square
	double areaOfSquare(double side) {
		//Area of square=side * siide
		return side*side;
	}
	
	double areaOfTriangle(float base,float height) {
		//Area of triangle=1/2bh
		return 0.5*base*height;
	}
	
	double areaOfCircle(double radius) {
		//Area of Circle=PI r^2;
		return Math.PI * radius * radius;
	}
	
	void main(String[] args) {
		System.out.println("main methood started.."); 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of Rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter breadth of a Rectangle:");
		int breadth=sc.nextInt();
		int areaOfRectangle=areaOfRectangle(length,breadth);
		System.out.println("Area of rectangle is "+areaOfRectangle+" square units..");
		
		
		System.out.println("Enter side val  of a squarde:");
		double side=sc.nextDouble();
		double areaOfSquare=areaOfSquare(side);
		System.out.println("Area of Square is "+areaOfSquare+" square units..");
		
		
		System.out.println("Enter base of triangle:");
		float base=sc.nextFloat();
		System.out.println("Enter height of triangle:");
		float height=sc.nextFloat();
		double areaOftriangle=areaOfTriangle(base,height);
		System.out.println("Area of a triangle is "+areaOftriangle+" square units..");
		
		
		System.out.println("Enter Radius of square:");
		
		double radius=sc.nextDouble();
		double areaOfCircle=areaOfCircle(radius);;
		System.out.printf("Area of Circle is %.2f %s ",areaOfCircle,"square units");
				
		sc.close();
		
		
	}
}
