package com.xworkz.classobject.clock;

public class ClockTester {

	public static void main(String[] args) {


		Clock sony = new Clock("sony", "newyork" , 555.00f);
		
		sony.display();
		sony.settingTimer();
		sony.alarm();
		
		
	
	}

}
