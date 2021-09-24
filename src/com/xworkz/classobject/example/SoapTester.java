package com.xworkz.classobject.example;

public class SoapTester {

	public static void main(String[] args) {
		Soap doveSoap = new Soap();
		doveSoap.color = "white";
		doveSoap.odor = "cream";
		doveSoap.prize = 50;
		doveSoap.quantity = 3;
		doveSoap.shape = "oval";
		
		System.out.println("The color of dove soap is : " + doveSoap.color);
		System.out.println("The odor of dove soap is : " + doveSoap.odor);
		System.out.println("The prize of dove soap is : " + doveSoap.prize);
		System.out.println("The quantity of dove soap is : " + doveSoap.quantity);
		System.out.println("The shape of dove soap is : " + doveSoap.shape);
	
		doveSoap.bathingPurpose();
		doveSoap.glowingSkin();
	
		Soap pearsSoap = new Soap();
		pearsSoap.color = "Golden Yellow";
		pearsSoap.odor = "sandal";
		pearsSoap.prize = 60;
		pearsSoap.quantity = 2;
		pearsSoap.shape = "sphere";
		
		System.out.println("The color of Pears soap is : " + pearsSoap.color);
		System.out.println("The odor of Pears soap is : " + pearsSoap.odor);
		System.out.println("The prize of Pears soap is : " + pearsSoap.prize);
		System.out.println("The quantity of Pears soap is : " + pearsSoap.quantity);
		System.out.println("The shape of dove Pears is : " + pearsSoap.shape);
		
		pearsSoap.glowingSkin();
	
	}
	

}
