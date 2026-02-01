package com.constructors;

public class Movie {
	String movieName;
	String hero;
	String heroine;
	double budget;
	String director;
	
	Movie(){
		System.out.println("no-arg constructor called...");
		movieName="Unknown";
		hero="Jai Baabu";
	}
	
	Movie(String director){
		this(); //constructor chaining 
		this.director=director;
	}
	
	Movie(Movie m3,String hero,double budget){
		System.out.println("parameterized constructor");
	    this.director=m3.director;
		this.hero=hero;
		this.budget=budget;
	}
	
	Movie(Movie m4,String heroine,String movie){
		this.heroine=heroine;
		this.movieName=movie;
		this.hero=m4.hero;
		this.budget=m4.budget;
		this.director=m4.director;
	}
	
	void show() {
		System.out.println("==========================");
		System.out.println("Name of movie   : "+movieName);
		System.out.println("Name of Hero    : "+hero);
		System.out.println("Name of Heroine : "+heroine);
		System.out.println("Budget of Movie : "+budget);
		System.out.println("Movie Director  : "+director);
		System.out.println("==========================");
	}
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		
		Movie m1=new Movie();
		m1.show();
		
		Movie m2=new Movie("S S Rajamouli");
		m2.show();
		
		Movie m3=new Movie(m2,"Mahesh Baabu",50000000.0);
		m3.show();
		
		Movie m4=new Movie(m3,"priyanka Chopra","SSMB-29");
		m4.show();
	}
}
