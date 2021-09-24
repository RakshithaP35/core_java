package com.xworkz.classobject.chaining.cookies;

public class CookiesTester {

	public static void main(String[] args) {
	
		Cookies butterCake = new Cookies("ButterCake",5,100.00f, "Butter","square");
		
		butterCake.baking();	//calling static with another class
		butterCake.eating();
		butterCake.display();
	}

}
