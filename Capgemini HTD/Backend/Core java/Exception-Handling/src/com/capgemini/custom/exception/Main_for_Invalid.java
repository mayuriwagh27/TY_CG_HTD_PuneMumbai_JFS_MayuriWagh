package com.capgemini.custom.exception;

public class Main_for_Invalid {

	public static void main(String[] args) {
		Validator v=new Validator();
		try {
			v.verify(2);
			System.out.println("Welcome");
					}
catch(InvalidAgeException a) {
	System.out.println(a.getMessage());
}
	}

}
