package com.xworkz.abstraction.watch;

public class Smartwatch extends DigitalWatch {

	@Override
	void showTime() {
		System.out.println("showing time in digital watch");

	}
	@Override
	void showSteps(int steps) {
		System.out.println("number of steps" + steps);
	}

}
