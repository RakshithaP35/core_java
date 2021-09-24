package com.xworkz.exceptionhandling.classCastinng;

public class Vehicle {
	
	String company;

	public Vehicle(String company) {
		this.company = company;
	}
	void travelling() {
		System.out.println("we can travel by vehicle");
	}
	@Override
	public String toString() {
		return "Vehicle [company=" + company + "]";
	}
	

}
