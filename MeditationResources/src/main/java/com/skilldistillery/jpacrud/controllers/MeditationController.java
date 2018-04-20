package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.jpacrud.data.BookDAO;
import com.skilldistillery.jpacrud.data.CenterDAO;
import com.skilldistillery.jpacrud.data.TeacherDAO;
import com.skilldistillery.jpacrud.data.TeacherDAOImpl;
import com.skilldistillery.jpacrud.entities.Teacher;

@Controller
public class MeditationController {
	
	@Autowired
	TeacherDAO tDao;
	@Autowired
	CenterDAO cDao;
	@Autowired
	BookDAO bDao;
	
	@RequestMapping(path = "index.do", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello");
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}

	@RequestMapping(path = "indexChoice.do", method = RequestMethod.GET)
	public ModelAndView choice(String choice) {
		ModelAndView mv = new ModelAndView();
		if (choice.equals("teachers")) {
			mv.setViewName("WEB-INF/views/teachers.jsp");
			mv.addObject("teachers", tDao.getTeachers());
			
		} else if (choice.equals("books")) {
			mv.setViewName("WEB-INF/views/books.jsp");
			mv.addObject("books", bDao.getBooks());
			
		} else if (choice.equals("centers")) {
			mv.setViewName("WEB-INF/views/centers.jsp");
			mv.addObject("centers", cDao.getCenters());
		}
		return mv;
	}
	@RequestMapping(path = "teacherChoice.do", method = RequestMethod.GET)
	public ModelAndView teacherChoice(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", tDao.getTeacherById(id));
		mv.setViewName("WEB-INF/views/showTeacher.jsp");
		return mv;
	}
	@RequestMapping(path = "bookChoice.do", method = RequestMethod.GET)
	public ModelAndView bookChoice(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("book", bDao.getBookById(id));
		mv.setViewName("WEB-INF/views/showBook.jsp");
		return mv;
	}
	@RequestMapping(path = "centerChoice.do", method = RequestMethod.GET)
	public ModelAndView centerChoice(int id) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center", cDao.getCenterById(id));
		mv.setViewName("WEB-INF/views/showCenter.jsp");
		return mv;
	}
	@RequestMapping(path = "goHome.do", method = RequestMethod.GET)
	public ModelAndView goHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}
}
