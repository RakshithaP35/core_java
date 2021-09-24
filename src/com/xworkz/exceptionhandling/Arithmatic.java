package com.xworkz.exceptionhandling;

public class Arithmatic {

	public static void main(String[] args) {
		int a=45,b=20;  // semi-colon(;) missing
				int c=a+b;  // asterisk(*) used instead of plus (+)
				System.out.println("sum is "+c);
				int d=a-12;
				System.out.println("difference is "+d);
				try {
				int e=a/0;  // division by zero
				System.out.println("quotient is "+e);
				}catch(ArithmeticException ae){
					System.out.println("invalid");
				}
				}
}