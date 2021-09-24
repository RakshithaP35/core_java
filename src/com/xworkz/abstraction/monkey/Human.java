package com.xworkz.abstraction.monkey;

public class Human extends Monkey {
	
	@Override
	void walk() {
		System.out.println("monkey walks");
		
	}
	void humanWalks() {
		System.out.println("humans can walk");
	}
	@Override
	void talk() {
		System.out.println("human talks");

	}

}
