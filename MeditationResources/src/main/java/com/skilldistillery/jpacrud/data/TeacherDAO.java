package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Book;
import com.skilldistillery.jpacrud.entities.Center;
import com.skilldistillery.jpacrud.entities.Teacher;


public interface TeacherDAO {

	public List<Teacher> getTeachers();
	Teacher getTeacherById(int id);
	public Teacher addTeacher(Teacher teacher);
	public boolean removeTeacher(Teacher teacher);
	public Teacher updateTeacher(Teacher teacher);
	
	
}
