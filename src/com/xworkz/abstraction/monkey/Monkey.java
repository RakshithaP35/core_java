package com.xworkz.abstraction.monkey;

public abstract class Monkey {
	String gender;
	int age;
	String color;
	
	abstract void walk(); 
	
	abstract void talk();

	@Override
	public String toString() {
		return "Monkey [gender=" + gender + ", age=" + age + ", color=" + color + "]";
	}
	

}
