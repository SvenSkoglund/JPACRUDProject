package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="author_first_name")
	String authorFirstName;
	
	@Column(name="author_last_name")
	String authorLastName;

	String title;
	
	String description;
	
	@Column(name="release_year")
	int releaseYear;
	
	@Column(name="cover_url")
	String coverUrl;
	
	public Book() {
		
	}

	public Book(int id, String authorFirstName, String authorLastName, String title, String description,
			int releaseYear, String coverUrl) {
		super();
		this.id = id;
		this.authorFirstName = authorFirstName;
		this.authorLastName = authorLastName;
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
		this.coverUrl = coverUrl;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getCoverUrl() {
		return coverUrl;
	}

	public void setCoverUrl(String coverUrl) {
		this.coverUrl = coverUrl;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", authorFirstName=" + authorFirstName + ", authorLastName=" + authorLastName
				+ ", title=" + title + ", description=" + description + ", releaseYear=" + releaseYear + ", coverUrl="
				+ coverUrl + "]";
	}
	
	
}
