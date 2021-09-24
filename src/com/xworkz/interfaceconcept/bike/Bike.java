package com.xworkz.interfaceconcept.bike;

public interface Bike {
	public static final double price = 180000;
	public static final Duke duke = new Duke();
	public static final RoyalEnfield royalenfield = new RoyalEnfield();

	
	
	static void moving() {
		System.out.println("bike moves");
		
	}
	
	void Travelling();
	
	
	
	
	
    
	
}
