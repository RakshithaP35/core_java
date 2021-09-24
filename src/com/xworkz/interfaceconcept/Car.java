package com.xworkz.interfaceconcept;

public interface Car {// it consist only abstract methods
	
	public static final String brand = "i10";//public static final
	// double price;
	// no constructor in interface coz we cant create instant of interface
	void steering();// public methods

	void applyBreak();

	static void accelarate() {
		System.out.println("static");
	}

	void chnageGear();

	void applyHorn();

}
