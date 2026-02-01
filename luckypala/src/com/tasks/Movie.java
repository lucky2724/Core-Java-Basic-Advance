package com.tasks;

public class Movie {
	String title;
	String director;
	double rating;
	
	Movie(){
		this("SALAAR");
		System.out.println("no-arg constructor called...");
	}
	
	Movie(String title){
		this(title,"PrashanthNeel");
		System.out.println("1 arg constructor called...");
	}
	
	Movie(String title,String director){
		this(title,director,5.0);
		System.out.println("2 arg constructor...");
	}
	
	Movie(String title,String director,double rating){
		System.out.println("3 arg constructor called...");
		this.title=title;
		this.director=director;
		this.rating=rating;
	}
	
	void show() {
		System.out.println("************************");
		System.out.println("Movie Title : "+title);
		System.out.println("Movie director : "+director);
		System.out.println("Rating : "+rating);
		System.out.println("*************************");
	}

	
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		
		Movie m1=new Movie();
		m1.show();
		
		Movie m2=new Movie("ANIMAL");
		m2.show();
		
		Movie m3=new Movie("DEVARA","KSHIVA");
		m3.show();
		
		Movie m4=new Movie("SSMB29","Rajamouli",9.8);
		m4.show();
	}
}
