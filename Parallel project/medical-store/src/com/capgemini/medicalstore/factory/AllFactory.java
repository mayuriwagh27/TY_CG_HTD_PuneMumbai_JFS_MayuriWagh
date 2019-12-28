package com.capgemini.medicalstore.factory;

import com.capgemini.medicalstore.dao.AddToCartDAO;
import com.capgemini.medicalstore.dao.AddToCartDAOImpl;
import com.capgemini.medicalstore.dao.AdminDAO;
import com.capgemini.medicalstore.dao.AdminDAOImpl;
import com.capgemini.medicalstore.dao.DiscussionDAO;
import com.capgemini.medicalstore.dao.DiscussionDAOImpl;
import com.capgemini.medicalstore.dao.ProductDAO;
import com.capgemini.medicalstore.dao.ProductDAOImpl;
import com.capgemini.medicalstore.dao.UserDAO;
import com.capgemini.medicalstore.dao.UserDAOImpl;
import com.capgemini.medicalstore.validation.ValidationDAO;
import com.capgemini.medicalstore.validation.ValidationImpl;

public class AllFactory {
	private AllFactory() {

	}

	public static ProductDAO getDAOInstance() {
		ProductDAO dao = new ProductDAOImpl();
		return dao;

	}

	public static AdminDAO getDAOInstance1() {
		AdminDAO dao = new AdminDAOImpl();
		return dao;
	}

	public static UserDAO getDAOInstance2() {
		UserDAO dao = new UserDAOImpl();
		return dao;
	}

	public static AddToCartDAO getDAOInstance3() {
		AddToCartDAO dao = new AddToCartDAOImpl();
		return dao;
	}

	public static DiscussionDAO getDAOInstance4() {
		DiscussionDAO dao = new DiscussionDAOImpl();
		return dao;
	}

	public static ValidationDAO validation() {
		ValidationDAO dao = new ValidationImpl();
		return dao;
	}
	

}// End of class
