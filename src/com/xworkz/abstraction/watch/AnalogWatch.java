package com.xworkz.abstraction.watch;

public class AnalogWatch extends Watch{
	void displayDate(String date) {
		System.out.println("todays date is :"+ date);
	}
	@Override
	void showTime() {//implementing of abst class
		System.out.println("SHOW TIME IN ANALOG");
		
	}

}
