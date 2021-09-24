package com.xworkz.methodoverloading;

public class Wallet {
	String material;
	String brand;
	String size;
	double price;
	
	void store() {
		System.out.println("we can store money");
	}
	
	void store(int amount) {
		System.out.println("storing" + amount + "of money");
	}
	void store(int amount, int noOfCards) {
		System.out.println("store" + amount + " of money and "+ noOfCards + "of card");
	}
	void money() {
		System.out.println("money");
	}
}
