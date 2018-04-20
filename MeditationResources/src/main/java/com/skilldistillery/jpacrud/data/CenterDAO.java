package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Book;
import com.skilldistillery.jpacrud.entities.Center;
import com.skilldistillery.jpacrud.entities.Teacher;


public interface CenterDAO {

	public List<Center> getCenters();
	public Center addCenter(Center center);
	public boolean removeCenter(int centerId);
	public Center updateCenter(Center center);
	Center getCenterById(int id);
	
}
