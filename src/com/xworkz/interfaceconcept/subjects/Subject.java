package com.xworkz.interfaceconcept.subjects;

public class Subject implements Mathematics, Science{

	@Override
	public void equations() {
		System.out.println("in science we use equations");
		
	}

	@Override
	public void operators() {
		System.out.println("in mathematics we use operators");

		
	}
	

}
