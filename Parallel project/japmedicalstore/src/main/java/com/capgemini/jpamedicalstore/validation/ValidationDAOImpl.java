package com.capgemini.jpamedicalstore.validation;

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
		pattern = Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,10}$");
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
	public boolean numberValidaton(String number) {
		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher(number);
		if (matcher.matches()) {
			return true;
		}

		return false;
	}

}// End of class
