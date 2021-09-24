package com.xworkz.classobject.chaining.cookies;

public class Cookies {
	String brand;
	int noOfCookies;
	float price;
	String flavour;
	String shape;

	Cookies() {
		System.out.println("defalut");
		display();
	}

	Cookies(String brand, int noOfCookies, float price, String flavour, String shape) {
		// System.out.println("5 agrs");
		this.brand=brand;
		this.noOfCookies=noOfCookies;
		this.price=price;
		this.flavour=flavour;
		this.shape=shape;
		eating(); // calling static inside the constructor
		selling();// calling non static inside the constructor
		
	}

	static void eating() {
		System.out.println("we love to eat cookies");
		//Cookies c = new Cookies();// calling non static inside the static by giving instance variable
		//c.display();
	}

	static void baking() {
		System.out.println("baking cookies are not so easy");
		eating();// calling static inside the static
	}

	void selling() {
		System.out.println("cookies can be sale");
	}

	void display() {
		System.out.println("\ncookies:");
		System.out.println(brand);
		System.out.println(noOfCookies);
		System.out.println(price);
		System.out.println(flavour);
		System.out.println(shape);

		eating();// calling static inside the non static
		selling(); // calling non static inside the non static
	}

	public static void main(String[] args) {
		eating();
	}
}
