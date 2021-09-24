package com.xworkz.exceptionhandling.filenotfoundexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNOtFoundException {

	public static void main(String[] args) {
		File f = new File("D:\\Users\\Dell\\eclipse-java\\ExceptionHandling\\src\\com\\xworkz\\exceptionhandling\\fileexceptionex\\hello.txt");
		
		try {
			FileReader in = new FileReader(f);
			System.out.println("Found The File");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ");
		} finally { // it will be executed whether exception occurs or not
			System.out.println("finally block");
		}
		System.out.println("End of the Program");
	}

}
