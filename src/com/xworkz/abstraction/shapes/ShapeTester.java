package com.xworkz.abstraction.shapes;

public class ShapeTester {

	public static void main(String[] args) {
		
		
		Circle s1 = new Circle();
		s1.type = "circle";
		s1.usage = "mathematics";
		s1.draw();
		s1.ball();
		s1.box();
		
		System.out.println(s1);

	}

}
