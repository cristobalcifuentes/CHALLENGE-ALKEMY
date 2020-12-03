package com.cristobal.alkemy.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "day")
public class Day {
	
	@Id
	@Column(name="day_id")
	private int id;
	
	@Column(name = "day", length = 20, nullable = false)
	private String day;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	

}
