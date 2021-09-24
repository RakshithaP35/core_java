package com.xworkz.methodoverloading;

public class Bottle {
	String material;
	String brand;
	String color;
	double price;
	
	private void store() {
		System.out.println("we can store money");
	}
	
	protected void store(String water) {
		System.out.println(" storing " + water + " in the bottel ");
	}
	void store(String water, String drink) {
		System.out.println(" store " + water + " in the bottel and also we can " + drink );

}
}
