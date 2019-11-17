package com.capgemini.custom.exception;
public class InvalidAgeException extends RuntimeException {
private String message=("Invalid age to proceed");


 public String getMessage() {
	 return message;
 }
 }