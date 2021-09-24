package com.xworkz.classobject.staticblock;

public class Curtuons {
	
	String material;
	int height;
	int width;
	String color;
	static String brand;
	
	static {
		System.out.println("static");
		brand = "D-decor";
	}
	{
		System.out.println(" nonstatic");
	}
	
	public Curtuons(String brand, String material, int height, int width, String color) {
	
		this.brand = brand;
		this.material = material;
		this.height = height;
		this.width = width;
		this.color = color;
	}
	public Curtuons() {
		System.out.println("defalut");
	}
	
	
	void display() {
		System.out.println(brand + material + height + width + color);
	}
	static void myMethod() {
		System.out.println("this is static method");
		
		//material = "cotton";
	}
}
