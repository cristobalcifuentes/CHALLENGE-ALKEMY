package com.cristobal.alkemy.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_subject")
	@SequenceGenerator(name = "seq_subject", sequenceName = "seq_subject", allocationSize = 1)
	@Column(name = "subject_id")
	private int id;
	
	
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	
	
	
	@Column(name = "quantity", nullable = false)
	private int quantity;
	
	
	@Column(name = "description", nullable = false, length = 4000)
	private String description;
	
	
	@ManyToOne
	@JoinColumn(name = "hour_hand_id", nullable = false, foreignKey = @ForeignKey(name = "FK_subject_hour_hand_id"))
	private HourHand hourHand;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public HourHand getHourHand() {
		return hourHand;
	}


	public void setHourHand(HourHand hourHand) {
		this.hourHand = hourHand;
	}


	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", quantity=" + quantity + ", description=" + description
				+ ", hourHand=" + hourHand + "]";
	}
	
	
	
	
	
}



	
	

	
