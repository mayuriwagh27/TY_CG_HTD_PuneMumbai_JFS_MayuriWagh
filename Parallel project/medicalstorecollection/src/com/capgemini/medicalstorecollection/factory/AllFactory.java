package com.capgemini.medicalstorecollection.factory;

import com.capgemini.medicalstorecollection.dao.AdminDAO;
import com.capgemini.medicalstorecollection.dao.AdminDAOImpl;
import com.capgemini.medicalstorecollection.dao.CartDAO;
import com.capgemini.medicalstorecollection.dao.CartDAOImpl;
import com.capgemini.medicalstorecollection.dao.DiscussionDAO;
import com.capgemini.medicalstorecollection.dao.DiscussionDAOImpl;
import com.capgemini.medicalstorecollection.dao.ProductDAO;
import com.capgemini.medicalstorecollection.dao.ProductDAoImpl;
import com.capgemini.medicalstorecollection.dao.UserDAO;
import com.capgemini.medicalstorecollection.dao.UserDAOImpl;
import com.capgemini.medicalstorecollection.validation.ValidationDAO;
import com.capgemini.medicalstorecollection.validation.ValidationDAOImpl;

public class AllFactory {
	private AllFactory() {

	}

	public static ProductDAO getDAOInstance() {
		ProductDAO dao = new ProductDAoImpl();
		return dao;

	}

	public static AdminDAO getDAOInstance1() {
		AdminDAO dao = new AdminDAOImpl();
		return dao;
	}

	public static UserDAO getDAOInstance2() {
		UserDAO dao1 = new UserDAOImpl();
		return dao1;
	}

	public static CartDAO getDAOInstance3() {
		CartDAO dao2 = new CartDAOImpl();
		return dao2;
	}

	public static DiscussionDAO getDAOInstance4() {
		DiscussionDAO dao = new DiscussionDAOImpl();
		return dao;
	}

	public static ValidationDAO getDAOInstance5() {
		ValidationDAO dao = new ValidationDAOImpl();
		return dao;
	}

}// End of class
