package com.skilldistillery.jpacrud.data;

public class TeacherDAOTest {

	public static void main(String[] args) {

		TeacherDAO tdao = new TeacherDAOImpl();
		System.out.println(tdao.getTeachers());
	}

}
