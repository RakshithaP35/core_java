package com.xworkz.classobject.cake;

public class CakeTester {

	public static void main(String[] args) {
		Cake theCake = new Cake("Red Velvet",3, "Square", "Mild Chocolate", 350.00d,true);
		theCake.display();
		theCake.eating();
		theCake.birthdayCelebration();
		
		Cake theCake2= new Cake("Black forest",2,  560.00d);
		theCake.display();
		theCake.birthdayCelebration();
	}
		
}
