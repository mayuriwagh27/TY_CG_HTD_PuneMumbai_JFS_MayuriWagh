package com.capgemini.medicalstorecollection.dao;

import java.util.List;

import com.capgemini.medicalstorecollection.beans.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllInfo();

	public ProductBean updateProduct(int productid, double price, String availability);

	public List<ProductBean> insertProduct(ProductBean productBean);

	public boolean deleteProduct(int productid);

	public ProductBean oneProduct(int productid);

	public boolean updateQuantity(ProductBean productBean);
}// End of interface
