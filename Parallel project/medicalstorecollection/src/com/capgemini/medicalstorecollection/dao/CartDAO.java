package com.capgemini.medicalstorecollection.dao;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.CartBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;

public interface CartDAO {
	public List<CartBean> addCart(UserBean userBean, ProductBean productBean);

	public List<CartBean> deleteCart(int productId);
}
