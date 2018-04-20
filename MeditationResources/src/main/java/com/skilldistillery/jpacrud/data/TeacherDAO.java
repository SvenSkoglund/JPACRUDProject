package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Book;
import com.skilldistillery.jpacrud.entities.Center;
import com.skilldistillery.jpacrud.entities.Teacher;


public interface TeacherDAO {

	public List<Teacher> getTeachers();
	Teacher getTeacherById(Integer id);
	public Teacher addTeacher(Teacher teacher);
	public boolean removeTeacher(int teacherId);
	public Teacher updateTeacher(Teacher teacher);
	
	
}
