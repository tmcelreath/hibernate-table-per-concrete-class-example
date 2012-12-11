package com.tmcelrea.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_BOOK")
@PrimaryKeyJoinColumn(name="THING_ID")
public class Book extends ThingSomeoneMade {

	@Column(name="AUTHOR")
	private String author;
	
	@Column(name="PUBLISHER")
	private String publsiher;
	
	@Column(name="CATEGORY")
	private String category;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublsiher() {
		return publsiher;
	}
	public void setPublsiher(String publsiher) {
		this.publsiher = publsiher;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
