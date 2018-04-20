package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Book;
import com.skilldistillery.jpacrud.entities.Center;
import com.skilldistillery.jpacrud.entities.Teacher;


public interface BookDAO {

	public List<Book> getBooks();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public boolean removeBook(Book book);
	public Book updateBook(Book book);
	

	
}
