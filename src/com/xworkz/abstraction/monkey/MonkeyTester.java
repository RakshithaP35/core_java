package com.xworkz.abstraction.monkey;

public class MonkeyTester {

	public static void main(String[] args) {
		Monkey m = new Human();
		m.age = 13;
		m.color = "Brown";
		m.gender = "Male";
		System.out.println(m);
		m.talk();
		m.walk();
		
		Human h = new Human();
		h.age = 23;
		h.color = "white";
		h.gender = "male";
		h.humanWalks();
		h.talk();
		h.walk();
		//System.out.println(h);
		
	}

}
