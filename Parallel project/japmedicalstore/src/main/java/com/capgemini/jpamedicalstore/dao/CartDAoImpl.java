package com.capgemini.jpamedicalstore.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpamedicalstore.bean.CartBean;
import com.capgemini.jpamedicalstore.bean.ProductBean;

public class CartDAoImpl implements CartDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	public static List<ProductBean> productList;
	Scanner sc = new Scanner(System.in);

	@Override
	public ProductBean getProduct() {
		ProductBean product;
		String jpql = "from ProductBean where productid=:pid";
		Query query = entityManager.createQuery(jpql);
		System.out.println("Enter product id which you want to buy");
		int productId = sc.nextInt();
		query.setParameter("pid", productId);
		product = (ProductBean) query.getSingleResult();
		return product;
	}

	@Override
	public boolean addToCart(CartBean cartbean) {
		transaction = entityManager.getTransaction();
		boolean isAdded = false;
		transaction.begin();
		entityManager.persist(cartbean);
		isAdded = true;
		transaction.commit();
		return isAdded;
	}

	@Override
	public boolean updateQuantity(int quantity, ProductBean productBean) {
		System.out.println(quantity);
		boolean updated = false;
		transaction.begin();
		String jpql = "update ProductBean set quantity =: Quantity where productid =: pid";
		Query query = entityManager.createQuery(jpql);
		int Quantity = productBean.getQuantity() - quantity;
		query.setParameter("Quantity", Quantity);

		query.setParameter("pid", productBean.getProductid());
		int res = query.executeUpdate();
		transaction.commit();
		if (res > 0) {
			updated = true;
		} else {
			updated = false;
		}
		return updated;
	}

	@Override
	public double payment(int userid) {
		transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "select sum(price) from CartBean c where userid =:id";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("id", userid);
		Double bill = (Double) query.getSingleResult();
		transaction.commit();
		return bill;

	}

}// End of class
