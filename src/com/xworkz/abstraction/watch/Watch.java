package com.xworkz.abstraction.watch;

public abstract class Watch { // abst class // we cant create instance
	String brand;
	double price;
	String color;

	void setAlarm(String time) {
		System.out.println("we can set alarm " + time);
	}

	// this is used to tell that it is a incomplete method. a class got one abs
	// method thn that complete class has become incomplete and it has to be include
	// abst in the class
	abstract void showTime(); // incomplete method. we can add abstract to that methoad and we'll be defining
								// in the sub class
	// implementation is done for this in child class.

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}
}
