package com.capgemini.custom.exception;

import java.util.Scanner;

public class TestA {

	public static void main(String[] args) {
	try(Scanner s=new Scanner(System.in))
	{
		
		System.out.println("Enter the age");
		int age=s.nextInt();
		System.out.println("age is "+age);
	}
		
		
	}

}
