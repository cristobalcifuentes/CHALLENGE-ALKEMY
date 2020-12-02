package com.cristobal.alkemy.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hour_hand")
public class HourHand {
	
	@Id
	@Column(name="hour_hand_id")
	private int id;
	
	@Column(name = "detail", length = 13, nullable = false)
	private String detail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "HourHand [id=" + id + ", detail=" + detail + "]";
	}
	
	
	
	

}
