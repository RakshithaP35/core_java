package com.xworkz.classobject.block.elephant;

public class Elephant {
	String name;
	int noOfElephant;
	String type;;
	//block,non static block, for initialization of values,it should be before const, we can give any values(user defined vales can be added).
	{ 
		System.out.println("inside block");
		this.name="abc";
		this.noOfElephant=8;
		this.type="Small Elephant   ";
	}
	
	public Elephant() {
		System.out.println("defalut");
		
	}

	public Elephant(String name, int noOfElephant, String type) {
		System.out.println("4args");
		
	}
	
	void display() {
		System.out.println("name:"+ name + ",\nnoOfElephant: "+ noOfElephant+ ",\ntype:"+type );
	}
	
}
