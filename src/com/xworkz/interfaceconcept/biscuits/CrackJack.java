package com.xworkz.interfaceconcept.biscuits;

public class CrackJack implements Oreo {

	@Override
	public void baking() {
		Oreo.super.baking();
	}
	void flavour() {
		System.out.println("Sweet and Slat");
	}


}
