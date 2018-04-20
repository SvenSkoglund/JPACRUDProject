package com.skilldistillery.jpacrud.data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.skilldistillery.jpacrud.entities.Book;

@Transactional
@Component
public class BookDAOImpl implements BookDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		String sql = "SELECT b from Book b";
		books = em.createQuery(sql, Book.class).getResultList();
		return books;
	}

	@Override
	public Book getBookById(int id) {
		Book book = em.find(Book.class, id);
		return book;
	}

	@Transactional
	@Override
	public Book addBook(Book book) {
		em.getTransaction().begin();
		em.persist(book);
		em.flush();
		em.getTransaction().commit();
		return book;
	}

	@Transactional
	@Override
	public boolean removeBook(int bookId) {
		Book book = getBookById(bookId);
		em.remove(book);
		em.flush();
		if (em.contains(book)) {
			return false;
		} else {
			return true;
		}
	}
	@Transactional
	@Override
	public Book updateBook(Book book) {
		Book managed = em.find(Book.class, book.getId());
		em.getTransaction().begin();
		managed.setAuthorFirstName(book.getAuthorFirstName());
		managed.setAuthorLastName(book.getAuthorLastName());
		managed.setTitle(book.getTitle());
		managed.setDescription(book.getTitle());
		managed.setReleaseYear(book.getReleaseYear());
		managed.setCoverUrl(book.getCoverUrl());

		em.flush();
		em.getTransaction().commit();

		return managed;
	}

}
