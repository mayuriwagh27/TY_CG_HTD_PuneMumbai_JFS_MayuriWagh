package com.capgemini.custom.exception;

public class Validator {
	void verify (int age) {
		if(age<18) {
			throw new InvalidAgeException();
		}
	}
	

}
