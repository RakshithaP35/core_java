package com.xworkz.abstraction.watch;

public class SmartWatchTester {

	public static void main(String[] args) {
		Watch miWatch = new Smartwatch();//upcasting
		
		miWatch.showTime();
		miWatch.setAlarm("6pm");
		
		Smartwatch appleWatch = new Smartwatch();
		appleWatch.setAlarm("7am");
		appleWatch.showTime();
		appleWatch.displayDate("1/jul/2021");
		appleWatch.showSteps(3456);

	}

}
