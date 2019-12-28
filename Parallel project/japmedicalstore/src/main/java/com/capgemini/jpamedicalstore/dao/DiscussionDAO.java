package com.capgemini.jpamedicalstore.dao;

import java.util.List;

import com.capgemini.jpamedicalstore.bean.DiscussionBean;

public interface DiscussionDAO {
	public boolean insertQuestion(DiscussionBean discussBean);

	public List<DiscussionBean> getQuestions();

	public boolean answerQuestion(DiscussionBean discussBean);
}// ENd of interface
