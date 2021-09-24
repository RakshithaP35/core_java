package com.xworkz.interfaceconcept.biscuits;

public class BiscuitsTester {

	public static void main(String[] args) {
		Biscuits b = new CrackJack();
		b.baking();
		b.temperature();
		
		CrackJack cj = new CrackJack();
		cj.baking();
		cj.flavour();
		cj.temperature();
		
		

	}

}
