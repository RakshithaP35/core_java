package com.xworkz.classobject.staticandnonstatic;

public class DoorTester {

	public static void main(String[] args) {
		Door door = new Door(); {
		System.out.println(door.company);		
		System.out.println(door.cost);
		System.out.println(door.numOfDoor);
			door.open();
			door.protection();
			door.closing();
		}

	}

}
