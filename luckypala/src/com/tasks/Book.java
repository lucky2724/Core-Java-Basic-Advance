package com.tasks;
import java.util.Scanner;
public class Book {
	int boookId;
	String title;
	String author;
	double price;
	double discountPercentage;
	
	void display() {
		double discountAmount=price*discountPercentage/100;
		double finalPrice=price-discountAmount;
		
		System.out.println("======= Book details ======");
		System.out.println("Book Id:"+boookId);
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("price:"+price);
		System.out.println("discountPercentage"+discountPercentage);
		System.out.println();
		System.out.println("DiscountAmount is:"+discountAmount);
		System.out.println("Final price after discount: "+finalPrice);
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Book b1=new Book();
		
		System.out.print("Enter Book id:");
		b1.boookId=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter title Name:");
		b1.title=sc.nextLine();
		
		System.out.print("Enter Author Name:");
		b1.author=sc.nextLine();
		
		System.out.print("Enter Book price:");
		b1.price=sc.nextDouble();
		
		System.out.print("Enter discount percentage:");
		b1.discountPercentage=sc.nextDouble();
		
		b1.display();

		sc.close();
	}

}
