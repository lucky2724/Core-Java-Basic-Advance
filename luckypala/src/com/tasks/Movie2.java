package com.tasks;

public class Movie2 {
	String title;
	String director;
	String hero;
	double rating;
	
	Movie2(){
		System.out.println("no arg constructor called");
		this("SPIRIT");
	}
	
	Movie2(String title){
		System.out.println("1 arg constructor called");
		//this.title=title;
		this(title,"VANGA");
	}
	
	Movie2(String title,String director){
		System.out.println("2 arg constructor");
		//this.title=title;
		//this.director=director;
		this(title,director,"Prabhas");
	}
	
	Movie2(String title,String director,String hero){
		System.out.println("3 arg constructor");
		//this.title=title;
		//this.director=director;
		//this.hero=hero;
		this(title,director,hero,9.7);
	}
	
	Movie2(String title,String director,String hero,double rating){
		System.out.println("4 arg constructor");
		this.title=title;
		this.director=director;
		this.hero=hero;
		this.rating=rating;
	}
	
	void show() {
		System.out.println("======= TFI Bagundali ======");
		System.out.println("Movie Name    : "+title);
		System.out.println("Director Name : "+director);
		System.out.println("Hero Name     : "+hero);
		System.out.println("Movie Rating  : "+rating);
		System.out.println("======= TFI Bagundali ======");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started...");
		
		Movie2 m1=new Movie2();
		m1.show();
		
		Movie2 m2=new Movie2("ANIMAL");
		m2.show();
		
		Movie2 m3=new Movie2("ANIMAL","VANGA","RANBIR");
		m3.show();
		
		Movie2 m4=new Movie2("ANIMAL","VANGA","RANBIR",4.9);
		m4.show();
	}
}
