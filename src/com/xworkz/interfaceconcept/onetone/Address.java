package com.xworkz.interfaceconcept.onetone;

public class Address implements Employee {
	String houseNo = "46A";
	String street = "2ndCross";
	long pin = 560060;

	@Override
	public void works() {
		System.out.println("he works");

	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", pin=" + pin + "]";
	}

}
