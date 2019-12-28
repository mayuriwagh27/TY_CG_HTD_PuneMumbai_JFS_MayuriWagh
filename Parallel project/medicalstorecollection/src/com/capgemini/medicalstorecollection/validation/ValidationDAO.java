package com.capgemini.medicalstorecollection.validation;

public interface ValidationDAO {
	public boolean idValidation(String id);

	public boolean nameValidation(String name);

	public boolean emailValidation(String email);

	public boolean passValidation(String pass);

	public boolean categoryValidation(String category);

	public boolean priceValidation(String price);

}// End of interface
