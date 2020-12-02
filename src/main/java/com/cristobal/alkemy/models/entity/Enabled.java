package com.cristobal.alkemy.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enabled")
public class Enabled {
	
	@Id
	@Column(name="enabled_id")
	private int id;
	
	@Column(name = "enabled", length = 8, nullable = false)
	private String enabled;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnabled() {
		return enabled;
	}

	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Enabled [id=" + id + ", enabled=" + enabled + "]";
	}
	
	
	
	
	

}
