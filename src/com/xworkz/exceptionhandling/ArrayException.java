package com.xworkz.exceptionhandling;

public class ArrayException {

	public static void main(String[] args) {

		System.out.println("begin prog");
		int[] intArray = { 10, 20, 30, 40, 50 };

		try {
			System.out.println(intArray[5]);// exception
		} catch (Exception e) {
			System.out.println("you are trying to access an invalid index");

		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("end prog");
	}

}
