package com.capgemini.medicalstorecollection.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.medicalstorecollection.beans.CartBean;
import com.capgemini.medicalstorecollection.beans.ProductBean;
import com.capgemini.medicalstorecollection.beans.UserBean;

public class CartDAOImpl implements CartDAO {
	private static List<CartBean> cartList = new ArrayList<CartBean>();
	CartBean cartBean = null;
	static int count = 1;
	static Scanner sc = new Scanner(System.in);

	@Override
	public List<CartBean> addCart(UserBean userBean, ProductBean productBean) {

		cartBean = new CartBean();
		cartBean.setCartid(count);
		cartBean.setProductid(productBean.getProductid());
		cartBean.setProductname(productBean.getProductname());
		cartBean.setUserId(userBean.getUserId());
		cartBean.setUserName(userBean.getUserName());
		cartBean.setPrice(productBean.getPrice());

		System.out.println("Enter Quantity");
		int Quantity = sc.nextInt();
		cartBean.setQuantity(Quantity);
		cartBean.setCategory(productBean.getCatagory());
		cartList.add(cartBean);
		if (cartList != null && !cartList.isEmpty()) {
			System.out.println("Product Added to Cart Successfully");
			int quantity = cartBean.getQuantity() - Quantity;
			System.out.println(quantity);
		} else {
			System.out.println("Unable to add product to Cart");
			addCart(userBean, productBean);
		}
		count++;
		return cartList;

	}

	@Override
	public List<CartBean> deleteCart(int productId) {
		boolean isDeleted = false;
		for (CartBean cartBean : cartList) {
			if (cartBean.getProductid() == productId) {
				cartList.remove(cartBean);
				isDeleted = true;
				break;
			}
		}
		return cartList;

	}

}
