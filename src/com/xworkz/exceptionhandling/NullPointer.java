package com.xworkz.exceptionhandling;

//import java.util.Scanner;

public class NullPointer {

	public static void main(String[] args) {

		String input1 = null;
		
		simpleNullCheck(input1);
	}

	private static void simpleNullCheck(String str1) {
		try {
		System.out.println(str1.length());
		}catch(Exception e) {
			System.out.println("invalid");
		}
	}
	}

