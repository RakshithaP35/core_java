package com.xworkz.interfaceconcept.markerInterface;

import java.util.Arrays;

public class Student implements Cloneable{
	
	String name;
	int age;
	long phno;
	Subject[] subject = new Subject[1];
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phno=" + phno + ", subject=" + Arrays.toString(subject)
				+ "]";
	}
	
	

}
