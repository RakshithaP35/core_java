package com.xworkz.methodoverloading;

public class Pot {
	String material;
	int noOfPot;
	float price;
	
	void plainting() {
		System.out.println("In pot we can plant");
	}
	void plainting(String material) {
		System.out.println("the pot can be of " + material + " pot");
	}
	
	void plainting(String material, int noOfPot, float price) {
		System.out.println("the pot can be of " + material + " pot" + " In the farm we can see " + noOfPot + " pot " + " the cost of single pot is " + price);
	}
	@Override
	public String toString() {
		return "Pot [material=" + material + ", noOfPot=" + noOfPot + ", price=" + price + "]";
	}
	

}
