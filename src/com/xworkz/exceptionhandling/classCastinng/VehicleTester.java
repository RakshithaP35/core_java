package com.xworkz.exceptionhandling.classCastinng;

public class VehicleTester {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("Honda");
		
		v.company = "Honda";
		v.travelling();
		
		Vehicle v1 = new Vehicle("w");
		Car c = (Car)v1;
		
	}

}
