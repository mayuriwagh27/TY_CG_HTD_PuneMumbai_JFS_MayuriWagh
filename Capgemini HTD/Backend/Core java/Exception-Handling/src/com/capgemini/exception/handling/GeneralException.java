package com.capgemini.exception.handling;

public class GeneralException {

	public static void main(String[] args) {
		int[]a=new int[4];
		String s="priya";
		try {
		System.out.println(a[7]);
		System.out.println(s.length());
		System.out.println(a[0]);
		System.out.println(10/2);
		System.out.println("hi");
		}
		catch(Exception e) {
			System.out.println("dont divide by zero");
			}

	}

}
