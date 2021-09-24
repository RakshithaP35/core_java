package com.xworkz.abstraction.shapes;

public abstract class Shape {
	String type;
	String usage;
	
	abstract void draw();

	@Override
	public String toString() {
		return "Shape [type=" + type + ", usage=" + usage + "]";
	}
	
	

}
