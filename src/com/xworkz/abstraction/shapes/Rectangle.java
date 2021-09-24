package com.xworkz.abstraction.shapes;

public abstract class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing rectangle");
	}
	 
	void box() {
		System.out.println("the box will be rectangular in shape");
	}

}
