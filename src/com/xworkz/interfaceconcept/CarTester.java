package com.xworkz.interfaceconcept;

public class CarTester {

	public static void main(String[] args) {
		 
		Car rapid = new SedanCar();//upcasting
		Car.accelarate();
		rapid.applyBreak();
		rapid.applyHorn();
		rapid.chnageGear();
		rapid.steering();
		System.out.println(rapid.brand);
		
		

	}

}
