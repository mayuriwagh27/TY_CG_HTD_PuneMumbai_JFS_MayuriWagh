package com.capgemini.jpamedicalstore.validation;

public interface ValidationDAO {
	public boolean nameValidation(String name);

	public boolean emailValidation(String email);

	public boolean passValidation(String pass);

	public boolean categoryValidation(String category);

	public boolean numberValidaton(String number);
}// End of interface
