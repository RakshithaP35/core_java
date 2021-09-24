package com.xworkz.classobject.staticandnonstatic;

public class Door {
	String company;
	double height;
	float cost;
	int numOfDoor;
	
	Door(){
		this("polytech",67.88f );
		System.out.println("defalut");
	}
	
	Door(String company, float cost) {
		this(company,67.88f,9);
		//System.out.println("3 args");

	}
	Door (String company, float cost, int numOfDoor){
		//System.out.println("3 args");
		this.company=company;
		this.cost=cost;
		this.numOfDoor = numOfDoor;
		protection();
	}
	static void open() {
		System.out.println("we can open door ");
		protection();
	}
	 static void protection() {
		System.out.println("Door protects our home");
		Door door = new Door();
		door.closing();		
	}
	 void closing() {
		 System.out.println("we can close the door");
		 
	 }
	public static void main(String[] args)
	{
		Door door = new Door();
		door.protection();
	}
}
