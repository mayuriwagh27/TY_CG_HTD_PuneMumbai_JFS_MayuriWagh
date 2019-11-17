package com.capgemini.mpt3.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.mpt3.beans.StudentInfoBean;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@PersistenceUnit
	private EntityManagerFactory em;

	@Override
	public StudentInfoBean getStudent(int student_id) {
		EntityManager manager = em.createEntityManager();
		StudentInfoBean studentInfoBean = manager.find(StudentInfoBean.class, student_id);
		manager.close();
		// em.close();
		return studentInfoBean;
	}

	@Override
	public boolean addStudent(StudentInfoBean studentInfoBean) {
		EntityManager manager = em.createEntityManager();
		EntityTransaction tx = manager.getTransaction();
		boolean isAdded = false;
		try {
			tx.begin();
			manager.persist(studentInfoBean);
			tx.commit();
			isAdded = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		manager.close();

		return isAdded;
	}// End of addStudent()

	@Override
	public boolean deleteStudent(int student_id) {
		EntityManager entityManager = em.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			StudentInfoBean studentInfoBean = entityManager.find(StudentInfoBean.class, student_id);
			entityManager.remove(studentInfoBean);
			tx.commit();
			isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		entityManager.close();
		return isDeleted;
	}// End of deleteStudent()

	@Override
	public boolean updateStudent(StudentInfoBean studentInfoBean) {
		EntityManager manager = em.createEntityManager();
		StudentInfoBean existingStudentInfo = manager.find(StudentInfoBean.class, studentInfoBean.getStudent_id());
		boolean isUpdated = false;

		if (existingStudentInfo != null) {
			String name = studentInfoBean.getStudent_name();
			if (name != null) {
				existingStudentInfo.getStudent_name();
			}

			String email_id = studentInfoBean.getEmail_id();
			if (email_id != null) {
				existingStudentInfo.setEmail_id(email_id);
				;
			}
			try {
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(existingStudentInfo);
				tx.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}

			manager.close();

		} // end of update employee
		return isUpdated;
	}

}// End of class
