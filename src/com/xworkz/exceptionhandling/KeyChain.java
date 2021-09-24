package com.xworkz.exceptionhandling;

public class KeyChain {
	private String shape;
	private int weightIngrms;
	private String color;
	public KeyChain(String shape, int weightIngrms, String color) {
		super();
		this.shape = shape;
		this.weightIngrms = weightIngrms;
		this.color = color;
	}
	
	
	public String getShape() {
		return shape;
	}


	public void setShape(String shape) {
		this.shape = shape;
	}


	public int getWeightIngrms() {
		return weightIngrms;
	}


	public void setWeightIngrms(int weightIngrms) {
		this.weightIngrms = weightIngrms;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "KeyChain [shape=" + shape + ", weightIngrms=" + weightIngrms + ", color=" + color + "]";
	}
	
	
}
