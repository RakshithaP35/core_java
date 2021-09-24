package com.xworkz.exceptionhandling.filenotfoundexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExample {

	public static void main(String[] args) {
		File f = new File(
				"C:\\21trans05\\New folder\\ExceptionHandling\\src\\com\\xworkz\\exceptionhandling\\filenotfoundexception\\hello.txt");
		try {
			FileReader in = new FileReader(f);
			System.out.println("Found The File");
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound ");
		} finally { // it will be executed whether exception occurs or not
			System.out.println("file exist");
		}
		System.out.println("End of the Program");
	}

}
