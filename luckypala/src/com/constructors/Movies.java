package com.constructors;

public class Movies {
	String movie;
	String hero;
	String heroine;
	double budget;
	String director;
	
	Movies(){
		System.out.println("no arg constructor called..");
	}
	
	void show() {
		System.out.println("==========================");
		System.out.println("Name of movie   : "+movie);
		System.out.println("Name of Hero    : "+hero);
		System.out.println("Name of Heroine : "+heroine);
		System.out.println("Budget of Movie : "+budget);
		System.out.println("Movie Director  : "+director);
		System.out.println("==========================");
	}
	
	Movies(String hero){
		this.hero=hero;
	}
	
	Movies(Movies m1,String movie){
		this.movie=movie;
		this.hero=m1.hero;
	}
	
	Movies(Movies m2,String heroine,String director){
		this.heroine=heroine;
		this.director=director;
		this.hero=m2.hero;
		this.movie=m2.movie;
	}
	
	Movies(Movies m3,double budget){
		this.budget=budget;
		this.director=m3.director;
		this.hero=m3.hero;
		this.movie=m3.movie;
		this.heroine=m3.heroine;
		
	}
	
	public static void main(String[] args) {
		System.out.println("main method started..");
		Movies m1=new Movies("Prabhas");
		m1.show();
		
		Movies m2=new Movies(m1,"SPIRIT");
		m2.show();
		
		Movies m3=new Movies(m2,"Tripti dimbri","Vangaism");
		m3.show();
		
		Movies m4=new Movies(m3,50000.55);
		m4.show();
	
	}
}
