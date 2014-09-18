package com.tarena.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tarena.service.QuestionService;

@Controller
public class QuestionController {
	@Resource(name = "questionService")
	private QuestionService questionService;

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	@RequestMapping(value = "/ask.do")
	public ModelAndView ask(@RequestParam("title_area") String title_area,
			@RequestParam("title_area_shadow") String title_area_shadow) {
		questionService.addQuestion(title_area, title_area_shadow);
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping(value = "/main.do")
	public void list(HttpServletRequest req, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		List<String> list = questionService.showBlog();
		JSONArray jsonArr = JSONArray.fromObject(list);
		out.print(jsonArr.toString());
	}
}