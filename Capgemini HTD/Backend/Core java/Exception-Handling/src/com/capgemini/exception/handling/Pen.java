package com.capgemini.exception.handling;

public class Pen {

	public static void main(String[] args) {
		System.out.println("main started");
try {
	System.out.println(10/2);
	System.out.println(10);
	System.out.println("Hi");
}
catch(ArithmeticException a) {
	System.out.println("please dont divide by zero");
}
System.out.println("main ended");
	}

}
