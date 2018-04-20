package com.skilldistillery.jpacrud.entities;

import javax.persistence.Entity;

@Entity
public class Book {

	int id;

	String authorFirstName;

	String authorLastName;

	String title;
	
	String description;
	
	int releaseYear;
	
	String coverUrl;
}
