package com.xworkz.constructors.tvexample;

public class Television {
	public String company;
	public String model;
	public int screenSizeInInch;
	public double resolution;
	public double costInRs;
	public boolean isSmartTv;
	
	// Special method -->constructor --> creation of instance, initialization of instance variable
	// constructor no return type
	// Same name as class name
	// n number of contructors
	// Constructor overloading
	// JVM adds default(no-arg) constructor only when there is no user-defined constructor
	//syntax : accessmodifiers ClassName(param list){...}
	Television() {
		System.out.println("Inside default constructor");
		company = "default";	
	}
	Television(String incompany, String inmodel)
	{
		company = incompany;
		model = inmodel;
	}
	
	Television(String company, String model, int screenSizeInInch)
	{
		this.company = company;
		this.model = model;
		this.screenSizeInInch = screenSizeInInch;
	}
	
	Television(String incompany, String inmodel, int inscreenSizeInInch, double inresolution, double incostInRs, boolean inisSmartTv)
	{
	company = incompany;
	model = inmodel;
	screenSizeInInch = inscreenSizeInInch;
	resolution = inresolution;
	costInRs = incostInRs;
	isSmartTv = inisSmartTv;
	}

	void watchingTv(String channel){
		System.out.println("watching "+ channel +" channel");
	}
	
	void playingGames() {
		System.out.println("Tv can be used for playing games");
	}
	
	void consumingPower(int watts) {
		System.out.println("consuming the power of "+ watts +" watts");
	}
	
	void display() {
		System.out.println("Tv Details:\n company: "+company);
		System.out.println("model: "+ model +"\nScreen size in Inch: "+screenSizeInInch);
		System.out.println("resolution: "+ resolution+"\ncost in Rs: "+costInRs+"\nis smart Tv? "+isSmartTv);
	}
}
