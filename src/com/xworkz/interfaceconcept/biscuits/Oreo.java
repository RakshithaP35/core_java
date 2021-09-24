package com.xworkz.interfaceconcept.biscuits;

public interface Oreo extends Biscuits{

	@Override
	default void baking() {
		System.out.println("Baking biscuits");
		
	}

	@Override
	default void temperature() {
		System.out.println("there should be limited temperature");
		
	}

	
	

}
