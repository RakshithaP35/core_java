package com.xworkz.interfaceconcept.markerInterface;

public class Subject {
	String sub1;
	String sub2;
	public Subject(String sub1, String sub2) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	@Override
	public String toString() {
		return "Subject [sub1=" + sub1 + ", sub2=" + sub2 + "]";
	}
	
	

}
