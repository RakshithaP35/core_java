package com.xworkz.abstraction.watch;

public abstract class DigitalWatch extends Watch {

	void displayDate(String date) {
		System.out.println("todays date is :"+ date + "in Digital watch");
	}
// not implementing abst method which is inherited from parent
	abstract void showSteps(int steps);
}
