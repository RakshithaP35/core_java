package com.xworkz.classobject.chaning.toothpaste;

public class ToothPaste {
	String name;
	float weight;
	double price;
	String flavour;
	String color;
	
	public ToothPaste() {
		this("Colgate");
		System.out.println("...");
		display();
		brushing();
	}

	private ToothPaste(String name) {
		this(name, "NeemSalt");
		System.out.println("1 args");
		//this.name = name;
	}

	public ToothPaste(String name, String flavour) {
		this(name, 200.89f, 100.00d, flavour, "white");
		System.out.println("2 args");
		//this.name = name;
		//this.flavour = flavour;
	}
	protected ToothPaste(String name, float weight, double price, String flavour, String color){
		//System.out.println("5 agrs");
		this.name= name;
		this.weight = weight;
		this.price = price;
		this.flavour= flavour;
		this.color = color;
	}
	 
	private void brushing() {
		System.out.println("brushing teeth");
	}
	public void display() {
		System.out.println("\nToothPaste:");
		System.out.println(name);
		System.out.println(weight);
		System.out.println(price);
		//System.out.println(flavour);
		//System.out.println(color);
}
}
