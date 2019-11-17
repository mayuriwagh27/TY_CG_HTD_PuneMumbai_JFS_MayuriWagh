package com.capgemini.exception.handling;

public class PVR {
	void confirm() {
		System.out.println("confirm started");
		try {
		System.out.println(10/0);
	}
catch(ArithmeticException e) {
	System.out.println("exception at confirm");
	throw e;
}
		finally {
		System.out.println("conform end");
}
}}