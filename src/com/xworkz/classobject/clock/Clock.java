package com.xworkz.classobject.clock;

public class Clock {
	String brand;
	int noOfClock;
	float price;
	String importedFrom;
	
	public Clock() {
		System.out.println(".....");
		brand = "default";
		}
	
	Clock(String inbrand, String inimportedFrom)
	{
		brand = inbrand;
		importedFrom = inimportedFrom;
	}
	
	Clock(String brand, String importedFrom, float price)
	{
		this.brand = brand;
		this.importedFrom = importedFrom;
		this.price = price;
	
	}
	
	Clock(String inbrand, String inimportedFrom, float inprice, int innoOfClock)
	{
		brand = inbrand;
		importedFrom = inimportedFrom;
		price = inprice;
		noOfClock = innoOfClock;
	}
	
	void settingTimer() {
		System.out.println("whenever we play game timer is necessary");
	}
	void alarm() {
		System.out.println("To wake up we keep alarm");
	}
	void display() {
		System.out.println("Clock Details:\ncompany:" + brand);
		System.out.println("Cost of clock: "+ price);
		System.out.println("number of clock: "+ noOfClock);
	}

}
