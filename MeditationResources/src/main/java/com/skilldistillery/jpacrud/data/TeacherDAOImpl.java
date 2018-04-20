package com.skilldistillery.jpacrud.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Teacher;
import com.skilldistillery.jpacrud.entities.Teacher;
import com.skilldistillery.jpacrud.entities.Teacher;

@Transactional
@Component
public class TeacherDAOImpl implements TeacherDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Teacher> getTeachers() {
		String sql = "select t from Teacher t";
		List<Teacher> teachers = new ArrayList<>();
		teachers = em.createQuery(sql, Teacher.class).getResultList();

		return teachers;
	}

	@Override
	public Teacher getTeacherById(Integer id) {
		Teacher teacher = em.find(Teacher.class, id);

		return teacher;
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		em.getTransaction().begin();
		em.persist(teacher);
		em.flush();
		em.getTransaction().commit();
		return teacher;
	}

	@Override
	public boolean removeTeacher(int teacherId) {
		Teacher teacher = em.find(Teacher.class, teacherId);
		em.remove(teacher);
		em.flush();
		if (em.contains(teacher)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		Teacher managed = em.find(Teacher.class, teacher.getId());
		em.getTransaction().begin();
		
		managed.setFirstName(teacher.getFirstName());
		managed.setLastName(teacher.getLastName());
		managed.setTradition(teacher.getTradition());
		managed.setDescription(teacher.getDescription());
		
		em.flush();
		em.getTransaction().commit();

		return managed;
	}

}
