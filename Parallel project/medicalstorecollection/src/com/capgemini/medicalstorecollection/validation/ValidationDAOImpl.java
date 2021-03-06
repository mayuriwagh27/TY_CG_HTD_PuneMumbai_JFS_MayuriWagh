package com.capgemini.medicalstorecollection.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationDAOImpl implements ValidationDAO {
	Pattern pattern = null;
	Matcher matcher = null;

	@Override
	public boolean nameValidation(String name) {
		pattern = Pattern.compile("\\w+\\s\\w+");
		matcher = pattern.matcher(name);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean emailValidation(String email) {

		pattern = Pattern.compile("\\w+\\@\\w+\\.\\w+");
		matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean passValidation(String pass) {
		pattern = Pattern.compile("\\w+");
		matcher = pattern.matcher(pass);
		if (matcher.matches()) {
			return true;
		}
		return false;

	}

	@Override
	public boolean categoryValidation(String category) {
		pattern = Pattern.compile("\\w+\\s\\w+");
		matcher = pattern.matcher(category);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean idValidation(String id) {
		pattern = Pattern.compile("\\d{1,10}");
		matcher = pattern.matcher(id);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean priceValidation(String price) {
		pattern = Pattern.compile("\\d+\\.\\d+");
		matcher = pattern.matcher(price);
		return false;
	}

}// End of class
