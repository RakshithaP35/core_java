package com.xworkz.abstraction.watch;

public class WatchTester {

	public static void main(String[] args) {
		Watch watch = new AnalogWatch(); //upcasting
		watch.showTime();// overridden method will be printing
		watch.brand = "titan";
		watch.color = "black";
		watch.price = 3000.00;
		watch.setAlarm("5Am");
		System.out.println(watch);
		
		//watch.showDate(); //because only it takes the method only which is in the parent class
	}

}
