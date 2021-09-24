package com.xworkz.classobject.cake;

public class Cake{
	String type;
	int noOfCakes;
	String shape;
	String flavour;
	double price;
	boolean isPastry;
	
	public Cake() {  	// default, non parameter constructor
		System.out.println("default");
		type = "default";
	}
	// parameter constructor
	Cake(String intype, int innoOfCakes, String inshape, String inflavour, double inprice, boolean inisPastry){
		type= intype;
		noOfCakes= innoOfCakes;
		shape=inshape;
		flavour = inflavour;
		price = inprice;
		isPastry = inisPastry;	
	}
	// by calling this keyword for parameter constructor
	Cake(String type, int noOfCakes, double price){
		this.type= type;
		this.noOfCakes= noOfCakes;
		this.price= price;
	}
	void eating() {
		System.out.println("we love to eat Cake");
	}
	void birthdayCelebration() {
		System.out.println("We buy Cake for bithday celebration");
	}
	
	void display()
	{
		System.out.println("\nCake? ");
		System.out.println("the type of the cake is : " + type);
		System.out.println("the no of the cake is : " + noOfCakes);
		System.out.println("the shape of the cake is : " + shape);
		System.out.println("the Flavour of the cake is : " + flavour);
		System.out.println("the price of the cake is : " + price);

	}
	













}
