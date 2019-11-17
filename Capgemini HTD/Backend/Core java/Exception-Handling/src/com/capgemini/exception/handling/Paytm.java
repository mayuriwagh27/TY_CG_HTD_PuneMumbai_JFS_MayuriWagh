package com.capgemini.exception.handling;

public class Paytm {
	void book() {
		System.out.println("book started");
		IRCTC i=new IRCTC();
		try {
		i.confirm();
		}
		catch(ArithmeticException e) {
			System.out.println("exception at confirm");
		
		
		System.out.println("book ended");
	}

}
}