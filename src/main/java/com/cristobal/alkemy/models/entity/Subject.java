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
import javax.persistence.Transient;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_subject")
	@SequenceGenerator(name = "seq_subject", sequenceName = "seq_subject", allocationSize = 1, initialValue = 2)
	@Column(name = "subject_id")
	private int id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Column(name = "quantity", nullable = false)
	private int quantity;

	@Column(name = "description", nullable = false, length = 4000)
	private String description;

	@ManyToOne
	@JoinColumn(name = "day_hour_hand_id", nullable = false, foreignKey = @ForeignKey(name = "FK_subject_day_hour_hand_id"))
	private DayHourHand dayHourHand;

	@ManyToOne
	@JoinColumn(name = "teacher_id", foreignKey = @ForeignKey(name = "FK_subject_teacher_id"))
	private Teacher teacher;
	
	@Transient
	private int cuposDisponibles;

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

	public DayHourHand getDayHourHand() {
		return dayHourHand;
	}

	public void setDayHourHand(DayHourHand dayHourHand) {
		this.dayHourHand = dayHourHand;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	

	public int getCuposDisponibles() {
		return cuposDisponibles;
	}

	public void setCuposDisponibles(int cuposDisponibles) {
		this.cuposDisponibles = cuposDisponibles;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", quantity=" + quantity + ", description=" + description
				+ ", dayHourHand=" + dayHourHand + ", teacher=" + teacher + ", cuposDisponibles=" + cuposDisponibles + "]";
	}



}
