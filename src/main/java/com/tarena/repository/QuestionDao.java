package com.tarena.repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tarena.entity.Question;

@Repository
public class QuestionDao {

	public void addQuestionDao(String title_area, String title_area_shadow) {
		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String time = fmt.format(date);
		String name = "a";
		Question q = new Question(name, time, title_area, title_area_shadow);
		System.out.println(q.toString());
	}

	public List<String> showBlogDao() {
		List<String> list = new ArrayList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		return list;
	}
}
