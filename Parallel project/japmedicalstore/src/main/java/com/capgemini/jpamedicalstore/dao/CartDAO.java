package com.capgemini.jpamedicalstore.dao;

import com.capgemini.jpamedicalstore.bean.CartBean;
import com.capgemini.jpamedicalstore.bean.ProductBean;

public interface CartDAO {
	public ProductBean getProduct();

	public boolean updateQuantity(int quantity, ProductBean productBean);

	public boolean addToCart(CartBean cartbean);

	public double payment(int userid);
}// End of interface
