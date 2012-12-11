package com.tmcelrea.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="T_ALBUMS")
@PrimaryKeyJoinColumn(name="THING_ID")
public class Album extends ThingSomeoneMade {

	@Column(name="ARTIST_NAME")
	private String artistName;
	
	@Column(name="GENRE")
	private String genre;
	
	@Column(name="LABEL")
	private String label;
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
