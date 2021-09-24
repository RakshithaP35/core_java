package com.xworkz.interfaceconcept;

public class SedanCar implements Car {

	@Override
	public  void steering() {
		System.out.println("moving Steering");
		
	}

	@Override
	public void applyBreak() {
		System.out.println("appling breaks");
		
	}


	@Override
	public void chnageGear() {
		System.out.println("we can change the gear");
		
	}

	@Override
	public void applyHorn() {
		System.out.println("applying horn");
		
	}

}
