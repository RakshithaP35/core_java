package com.xworkz.exceptionhandling;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		System.out.println("programs to illustrate division operation");
		Scanner scan = new Scanner(System.in);
		String name = "hie";
		System.out.println("Enter your name:");
		String scannedinput = scan.next(); 
		if(scannedinput.length()>1)
		name = scannedinput;
		System.out.println("enter two number");
		
		//Scanner scan = new Scanner(System.in);
		int divident = scan.nextInt();
		int divisor = scan.nextInt();
		
		
		try {
			int result = divident / divisor;// new ArithmeticException();
			System.out.println("the division of  " + divident + "/ "+divisor + "is :" + result);

			System.out.println("welcom "+ name);
			int noOfCharInName = name.length();
			System.out.println("no of char in your name " +noOfCharInName );
			
			
		}catch(ArithmeticException e) {
			System.out.println("received zeor as a divisor please enter non Zero number");
		}
		catch(NullPointerException e) {
			System.out.println("enter non-null Value");
		}
		catch(Exception e) {
			System.out.println("there was an exception in the code");
		}
		System.out.println("Remaining statement...");
		System.out.println("end of the program");

	}
}

