package com.tarena.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tarena.repository.QuestionDao;

@Service
public class QuestionService {
	@Resource(name = "questionDao")
	private QuestionDao questionDao;

	public QuestionDao getQuestionDao() {
		return questionDao;
	}

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	public void addQuestion(String title_area, String title_area_shadow) {
		questionDao.addQuestionDao(title_area, title_area_shadow);
	}

	public List<String> showBlog() {
		List<String> list = questionDao.showBlogDao();
		return list;
	}
}
