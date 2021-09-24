package com.xworkz.methodoverloading;

public class BottleTester {

	public static void main(String[] args) {
	
		Bottle bottle = new Bottle();
		//bottle.store();
		bottle.store("water");
		bottle.store("water", "drink");

	}

}
