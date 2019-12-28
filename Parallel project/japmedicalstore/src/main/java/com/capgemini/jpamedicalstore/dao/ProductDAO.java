package com.capgemini.jpamedicalstore.dao;

import java.util.List;

import com.capgemini.jpamedicalstore.bean.ProductBean;

public interface ProductDAO {
	public List<ProductBean> getAllInfo();

	public boolean addProduct(ProductBean product);

	public boolean updateProduct(int productid, String name, double price, int quantity);

	public void deleteProduct(int productid);
}// End of interface
