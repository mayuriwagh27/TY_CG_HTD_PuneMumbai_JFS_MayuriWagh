package com.capgemini.medicalstore.dao;

import java.util.List;

import com.capgemini.medicalstore.bean.ProductBean;
import com.capgemini.medicalstore.bean.UserBean;

public interface UserDAO {
	public UserBean getRegister();

	public UserBean getLogin(String emailId, String password);

	public List<ProductBean> getAllInfo();

	public void updatePassword();

	public boolean logout();

}
