package com.capgemini.mpt3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.mpt3.beans.StudentInfoBean;
import com.capgemini.mpt3.dao.StudentDAO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	@Override
	public StudentInfoBean getStudent(int student_id) {
		return dao.getStudent(student_id);
	}

	@Override
	public boolean addStudent(StudentInfoBean studentInfoBean) {
		return dao.addStudent(studentInfoBean);
	}

	@Override
	public boolean deleteStudent(int student_id) {
		return dao.deleteStudent(student_id);
	}

	@Override
	public boolean updateStudent(StudentInfoBean studentInfoBean) {
		return dao.updateStudent(studentInfoBean);
	}
}// End of class
