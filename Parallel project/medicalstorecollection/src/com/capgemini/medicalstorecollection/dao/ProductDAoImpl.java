package com.capgemini.medicalstorecollection.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.medicalstorecollection.beans.ProductBean;

public class ProductDAoImpl implements ProductDAO {
	static ProductBean product = null;
	public static List<ProductBean> productlist;

	static {
		productlist = new ArrayList<ProductBean>();
		ProductBean product1 = new ProductBean();
		product1.setProductid(1);
		product1.setCatagory("Ayurvedic");
		product1.setProductname("Himalaya");
		product1.setQuantity(100);
		product1.setPrice(120);
		product1.setAvailability("available");
		productlist.add(product1);

		ProductBean product2 = new ProductBean();
		product2.setProductid(2);
		product2.setCatagory("Eye care");
		product2.setProductname("Eye cool");
		product2.setQuantity(150);
		product2.setPrice(35);
		product2.setAvailability("available");
		productlist.add(product2);

		ProductBean product3 = new ProductBean();
		product3.setProductid(3);
		product3.setCatagory("Baby care");
		product3.setProductname("Baby soap");
		product3.setQuantity(200);
		product3.setPrice(20);
		product3.setAvailability("available");
		productlist.add(product3);

		ProductBean product4 = new ProductBean();
		product4.setProductid(4);
		product4.setCatagory("Bady care");
		product4.setProductname("Iodex Balm");
		product4.setQuantity(102);
		product4.setPrice(50);
		product4.setAvailability("available");
		productlist.add(product4);

		ProductBean product5 = new ProductBean();
		product5.setProductid(5);
		product5.setCatagory("Bady care");
		product5.setProductname("Iodex Balm");
		product5.setQuantity(102);
		product5.setPrice(50);
		product5.setAvailability("available");
		productlist.add(product5);
	}// End of static

	@Override
	public List<ProductBean> getAllInfo() {
		return productlist;
	}// End of getAllInfo()

	@Override
	public ProductBean updateProduct(int productid, double price, String availability) {
		ProductBean bean = new ProductBean();
		for (ProductBean productbean : productlist) {
			if (productbean.getProductid() == productid) {
				productbean.setPrice(price);
				productbean.setAvailability(availability);
				bean = productbean;
			}
		}
		return bean;
	}

	@Override
	public List<ProductBean> insertProduct(ProductBean productBean) {
		List<ProductBean> li = productlist;
		li.add(productBean);
		return li;

	}// End of insertProduct()

	@Override
	public boolean deleteProduct(int productid) {
		// boolean isDeleted = false;
		for (ProductBean productbean : productlist) {
			if (productbean.getProductid() == productid) {
				productlist.remove(productbean);
				return true;
				// break;
			}
		}
		return false;
	}// end of deleteProduct()

	@Override
	public ProductBean oneProduct(int productid) {
		for (ProductBean productBean : productlist) {
			if (productBean.getProductid() == (productid)) {
				return productBean;
			}
		}
		return product;

	}// End of oneProduct()

	@Override
	public boolean updateQuantity(ProductBean productBean) {
		for (ProductBean Bean : productlist) {
			if (Bean.getProductid() == Bean.getProductid()) {
				Bean.setQuantity(Bean.getQuantity());
				return true;
			}
		}
		return false;
	}

}// End of class
