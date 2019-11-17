package com.capgemini.exception.handling;
import java.io.File;
import java.io.IOException;

public class Checkedxception {

	public static void main(String[] args) {
		System.out.println("main started");
		File f= new File("Mayuti.txt");
		try {
			f.createNewFile();
			System.out.println("file created");
		}
		catch(IOException a) {
			System.out.println("not able to create file");
		}
		System.out.println("main ended");
	}

}
