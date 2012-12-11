package com.tmcelrea.example.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="T_THING")
@Inheritance(strategy=InheritanceType.JOINED)
public class ThingSomeoneMade {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Long thingId;
	
	@Column(name="THING_TYPE")
	private String thingType;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="RELEASE_DATE")
	private Date releaseDate;
	
	public Long getThingId() {
		return thingId;
	}
	public void setThingId(Long thingId) {
		this.thingId = thingId;
	}
	public String getThingType() {
		return thingType;
	}
	public void setThingType(String thingType) {
		this.thingType = thingType;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
