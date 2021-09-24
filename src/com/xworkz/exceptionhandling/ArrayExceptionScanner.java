package com.xworkz.exceptionhandling;

import java.util.Scanner;

public class ArrayExceptionScanner {

	public static void main(String[] args) {
		System.out.println("Start");

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[3];

		try {
			System.out.println("elements are:");
			for (int i = 0; i < num; i++)
				arr[i] = s.nextInt();

			System.out.println("array elements size:");
			for (int i = 0; i < num; i++)
				System.out.println(arr[i]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Try Again");
		}

	}
}
