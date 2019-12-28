package com.capgemini.jpamedicalstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpamedicalstore.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();
	public static List<ProductBean> productList;

	@Override
	public List<ProductBean> getAllInfo() {
		String jpql = "from ProductBean";
		Query query = entityManager.createQuery(jpql);
		productList = query.getResultList();
		return productList;

	}

	@Override
	public boolean addProduct(ProductBean product) {
		boolean inserted = false;
		transaction.begin();
		entityManager.persist(product);
		System.out.println("Product inserted to store");
		inserted = true;
		transaction.commit();
		return inserted;

	}

	@Override
	public boolean updateProduct(int productId, String name, double price, int quantity) {

		String jpql = "update ProductBean set name =: pname, price=:price, quantity=: quantity where productid =:pid";
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("quantity", quantity);
		query.setParameter("pid", productId);
		query.setParameter("price", price);
		query.setParameter("pname", name);
		int res = query.executeUpdate();
		transaction.commit();
		if (res > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void deleteProduct(int productid) {
		transaction.begin();
		String jpql = "delete from ProductBean where productid =:pid";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("pid", productid);
		int res = query.executeUpdate();
		transaction.commit();
		if (res > 0) {
			System.out.println("Product deleted successfully");
		} else {
			System.out.println("Product not deleted");
		}

	}

}
