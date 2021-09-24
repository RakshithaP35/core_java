package com.xworkz.WrapperClass;

public class OddEvenNumber {

	public static void main(String[] args) {
		int num = 5;
		findOddeven(num);

	}

	public static int findOddeven(int num) {

		if (num % 2 == 0)
			System.out.println(num + " is even");
		else {
			System.out.println(num + " is odd");

		}
		return num;

	}
}
