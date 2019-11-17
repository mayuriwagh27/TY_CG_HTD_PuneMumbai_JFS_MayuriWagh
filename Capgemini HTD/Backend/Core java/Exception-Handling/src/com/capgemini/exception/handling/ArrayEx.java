package com.capgemini.exception.handling;

public class ArrayEx {

	public static void main(String[] args) {
		System.out.println("start");
		int[]a=new int[4];
		String s="priya";
		try {
		System.out.println(a[2]);
		System.out.println(s.length());
		System.out.println(a[0]);
		System.out.println(10/0);
		System.out.println("hi");
		}
		catch(ArrayIndexOutOfBoundsException eg) {
			System.out.println("dont cross array boundry");
	}
		catch(ArithmeticException e) {
	System.out.println("dont divide by zero");
	}
		System.out.println("end");
	}
}