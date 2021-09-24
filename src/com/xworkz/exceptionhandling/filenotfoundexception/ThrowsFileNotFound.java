package com.xworkz.exceptionhandling.filenotfoundexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsFileNotFound {
	public static void main(String[] args) throws FileNotFoundException {

		readFile();
	}

	private static void readFile() throws FileNotFoundException {
		File f = new File("C:\\21trans05\\New folder\\ExceptionHandling\\src\\com\\xworkz\\exceptionhandling\\filenotfoundexception\\hello.txt");
		FileReader in = new FileReader(f);
		System.out.println("Found The File");
	}

}
