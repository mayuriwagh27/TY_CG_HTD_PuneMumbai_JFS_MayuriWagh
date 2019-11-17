package com.capgemini.custom.exception;

public class Invalid_limit_Exception extends Exception {
	
	private String s="Day limit is only 4000";
	
@Override
public String getMessage() {

	return s;
}

}
