package com.skilldistillery.jpacrud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		} else {
			mv.addObject("message", "Unable to Delete");
		}
		;
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}

	@RequestMapping(path = "updateTeacher.do", method = RequestMethod.GET)
	public ModelAndView teacherUpdate(int teacherId) {
		ModelAndView mv = new ModelAndView();
		Teacher teacher = tDao.getTeacherById(teacherId);
		mv.addObject("teacher", teacher);
		mv.setViewName("WEB-INF/views/updateTeacher.jsp");
		return mv;
	}

	@RequestMapping(path = "updateCenter.do", method = RequestMethod.GET)
	public ModelAndView updateCenter(int centerId) {
		ModelAndView mv = new ModelAndView();
		Center center = cDao.getCenterById(centerId);
		mv.addObject("center", center);
		mv.setViewName("WEB-INF/views/updateCenter.jsp");
		return mv;
	}

	@RequestMapping(path = "updateBook.do", method = RequestMethod.GET)
	public ModelAndView updateBook(int bookId) {
		ModelAndView mv = new ModelAndView();
		Book book = bDao.getBookById(bookId);
		mv.addObject("book", book);
		mv.setViewName("WEB-INF/views/updateBook.jsp");
		return mv;
	}

	@RequestMapping(path = "update.do", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam(name = "id") int id, Teacher teacher) {
		ModelAndView mv = new ModelAndView();
		Teacher updated = tDao.updateTeacher(id, teacher);
		mv.addObject("teacher", updated);
		mv.setViewName("WEB-INF/views/update.jsp");
		return mv;
	}

	@RequestMapping(path = "update.do", method = RequestMethod.GET, params = "centerId")
	public ModelAndView update(@RequestParam(name = "centerId") int id, Center center) {
		ModelAndView mv = new ModelAndView();
		Center updated = cDao.updateCenter(id, center);
		mv.addObject("center", updated);
		mv.setViewName("WEB-INF/views/update.jsp");
		return mv;
	}

	@RequestMapping(path = "update.do", method = RequestMethod.GET, params = "bookId")
	public ModelAndView update(@RequestParam(name = "bookId") int id, Book book) {
		ModelAndView mv = new ModelAndView();
		Book updated = bDao.updateBook(id, book);
		mv.addObject("book", updated);
		mv.setViewName("WEB-INF/views/update.jsp");
		return mv;
	}

	@RequestMapping(path = "delete.do", method = RequestMethod.GET)
	public ModelAndView update(@RequestParam(name = "bookId") int bookId, int centerId, int teacherId, Object object) {
		ModelAndView mv = new ModelAndView();
		if (bookId > 0) {
			boolean isDeleted = bDao.removeBook(bookId);
			if (isDeleted) {
				mv.addObject("message", "Deleted succesfully");
			} else {
				mv.addObject("message", "Unable to Delete");
			}
			mv.addObject("isDeleted", isDeleted);

		} else if (centerId > 0) {
			boolean isDeleted = cDao.removeCenter(centerId);
			if (isDeleted) {
				mv.addObject("message", "Deleted succesfully");
			} else {
				mv.addObject("message", "Unable to Delete");
			}
			mv.addObject("isDeleted", isDeleted);

		} else if (teacherId > 0) {
			boolean isDeleted = tDao.removeTeacher(teacherId);
			if (isDeleted) {
				mv.addObject("message", "Deleted succesfully");
			} else {
				mv.addObject("message", "Unable to Delete");
			}
			mv.addObject("isDeleted", isDeleted);
		}
		mv.setViewName("WEB-INF/views/delete.jsp");
		return mv;
	}

	@RequestMapping(path = "add.do", method = RequestMethod.GET)
	public ModelAndView add(int bookId, int centerId, int teacherId) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("bookId", bookId);
		mv.addObject("centerId", centerId);
		mv.addObject("teacherId", teacherId);
		mv.setViewName("WEB-INF/views/add.jsp");
		return mv;
	}

	@RequestMapping(path = "addBook.do", method = RequestMethod.GET)
	public ModelAndView addBook(Book book) {
		ModelAndView mv = new ModelAndView();
		bDao.addBook(book);
		mv.addObject("book", 1);
		mv.setViewName("WEB-INF/views/added.jsp");
		return mv;
	}

	@RequestMapping(path = "addCenter.do", method = RequestMethod.GET)
	public ModelAndView addCenter(Center center) {
		ModelAndView mv = new ModelAndView();
		cDao.addCenter(center);
		mv.addObject("center", 1);
		mv.setViewName("WEB-INF/views/added.jsp");
		return mv;
	}

	@RequestMapping(path = "addTeacher.do", method = RequestMethod.GET)
	public ModelAndView addTeacher(Teacher teacher) {
		ModelAndView mv = new ModelAndView();
		tDao.addTeacher(teacher);
		mv.addObject("teacher", 1);
		mv.setViewName("WEB-INF/views/added.jsp");
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
		} else {
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
		} else {
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
