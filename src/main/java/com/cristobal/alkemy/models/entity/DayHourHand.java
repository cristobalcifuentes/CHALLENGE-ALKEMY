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
@Table(name = "day_hour_hand")
public class DayHourHand {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_day_hour_hand")
	@SequenceGenerator(name = "seq_day_hour_hand", sequenceName = "seq_day_hour_hand", allocationSize = 1, initialValue= 2)
	@Column(name = "day_hour_hand_id")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name = "day_id", nullable = false, foreignKey = @ForeignKey(name = "FK_day_hour_hand_day_id"))
	private Day day;
	
	@ManyToOne
	@JoinColumn(name = "hour_hand_id", nullable = false, foreignKey = @ForeignKey(name = "FK_day_hour_hand_hour_hand_id"))
	private HourHand hourHand;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public HourHand getHourHand() {
		return hourHand;
	}

	public void setHourHand(HourHand hourHand) {
		this.hourHand = hourHand;
	}
	
	

}
