package com.xworkz.classobject.staticblock;

public class CurtuonsTester {

	public static void main(String[] args) {
		// Static block is called first time and it is called only once 
		Curtuons.myMethod();
		Curtuons curtouns = new Curtuons();
		Curtuons curtouns1 = new Curtuons();
	}

}
