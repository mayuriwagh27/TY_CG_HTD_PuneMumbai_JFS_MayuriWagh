package com.capgemini.exception.handling;

public class TestPVR {

	public static void main(String[] args) {
		System.out.println("main atart");
		PVR p=new PVR();
		try {
		p.confirm();
		}
		catch(ArithmeticException e) {
			System.out.println("exception in main");
		}
		System.out.println("main ended");
		}

}
