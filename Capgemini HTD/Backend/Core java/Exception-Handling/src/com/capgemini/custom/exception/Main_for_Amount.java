package com.capgemini.custom.exception;

public class Main_for_Amount {

	public static void main(String[] args) {
		Amount a= new Amount();
		try {
			a.check(2555);
			System.out.println("collect amount");
		} catch (Invalid_limit_Exception e) {
		
			System.out.println(e.getMessage());;
		}

	}

}
