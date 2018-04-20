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
import com.skilldistillery.jpacrud.entities.Book;
import com.skilldistillery.jpacrud.entities.Center;
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
			List<Teacher> teachers = tDao.getTeachers();
			mv.addObject("teachers", teachers);
			
		} else if (choice.equals("books")) {
			mv.setViewName("WEB-INF/views/books.jsp");
			mv.addObject("books", bDao.getBooks());
			
		} else if (choice.equals("centers")) {
			mv.setViewName("WEB-INF/views/centers.jsp");
			mv.addObject("centers", cDao.getCenters());
		}
		return mv;
	}
	@RequestMapping(path = "showTeacher.do", method = RequestMethod.GET)
	public ModelAndView teacherChoice(int teacherId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("teacher", tDao.getTeacherById(teacherId));
		mv.setViewName("WEB-INF/views/showTeacher.jsp");
		return mv;
	}
	@RequestMapping(path = "deleteTeacher.do", method = RequestMethod.GET)
	public ModelAndView teacherDelete(int teacherId) {
		ModelAndView mv = new ModelAndView();
		if (tDao.removeTeacher(teacherId)) {
			mv.addObject("message", "Deleted Succesfully");
		}else {
			mv.addObject("message", "Unable to Delete");
		}
		;
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}
	
	@RequestMapping(path = "showBook.do", method = RequestMethod.GET)
	public ModelAndView bookChoice(int bookId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("book", bDao.getBookById(bookId));
		mv.setViewName("WEB-INF/views/showBook.jsp");
		return mv;
	}
	@RequestMapping(path = "deleteBook.do", method = RequestMethod.GET)
	public ModelAndView bookDelete(int bookId) {
		ModelAndView mv = new ModelAndView();
		Book book = bDao.getBookById(bookId);
		if (bDao.removeBook(book.getId())) {
			mv.addObject("message", "Deleted Succesfully");
		}else {
			mv.addObject("message", "Unable to Delete");
		}
		;
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}
	
	
	@RequestMapping(path = "showCenter.do", method = RequestMethod.GET)
	public ModelAndView centerChoice(int centerId) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("center", cDao.getCenterById(centerId));
		mv.setViewName("WEB-INF/views/showCenter.jsp");
		return mv;
	}
	
	@RequestMapping(path = "deleteCenter.do", method = RequestMethod.GET)
	public ModelAndView centerDelete(int centerId) {
		ModelAndView mv = new ModelAndView();
		if (cDao.removeCenter(centerId)) {
			mv.addObject("message", "Deleted Succesfully");
		}else {
			mv.addObject("message", "Unable to Delete");
		}
		;
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}
	@RequestMapping(path = "goHome.do", method = RequestMethod.GET)
	public ModelAndView goHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("WEB-INF/views/index.jsp");
		return mv;
	}
}
