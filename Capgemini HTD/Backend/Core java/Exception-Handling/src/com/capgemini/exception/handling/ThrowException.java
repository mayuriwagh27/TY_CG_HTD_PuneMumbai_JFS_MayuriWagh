package com.capgemini.exception.handling;

import java.io.File;
import java.io.IOException;

public class ThrowException {

	public static void main(String[] args) throws IOException {
		File f= new File("Mayuri.txt");
		f.createNewFile();
		System.out.println("file created");
	}

}
