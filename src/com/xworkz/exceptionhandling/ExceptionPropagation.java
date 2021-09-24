package com.xworkz.exceptionhandling;

public class ExceptionPropagation {
	void m1() {
		System.out.println("starts m1");
		try {
			m2();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("end m1");
	}

	void m2() {
		System.out.println("starts m2");

		m3();

		System.out.println("end m2");
	}

	void m3() {
		System.out.println("starts m3");
		String name = null;
		// name.length(); // NullPointerException
		System.out.println("value of name is :" + name);
		System.out.println("end m3");
	}

	public static void main(String[] args) {
		System.out.println("");
		ExceptionPropagation mmc = new ExceptionPropagation();
		mmc.m1();

		System.out.println("ending main");
	}

}
