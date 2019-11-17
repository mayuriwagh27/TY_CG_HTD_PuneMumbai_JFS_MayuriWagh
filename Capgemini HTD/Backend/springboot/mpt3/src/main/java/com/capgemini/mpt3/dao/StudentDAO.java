package com.capgemini.mpt3.dao;

import com.capgemini.mpt3.beans.StudentInfoBean;

public interface StudentDAO {
	public StudentInfoBean getStudent(int student_id);

	public boolean addStudent(StudentInfoBean studentInfoBean);

	public boolean deleteStudent(int student_id);

	public boolean updateStudent(StudentInfoBean studentInfoBean);

}// End of class
