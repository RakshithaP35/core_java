package com.xworkz.methodoverloading;

public class PotTester {

	public static void main(String[] args) {
		Pot pot = new Pot();
		pot.material="mud";
		pot.noOfPot=6;
		pot.price=50.00f;
		pot.plainting();
		System.out.println(pot);
		pot.plainting("plactic");
		
	}

}
