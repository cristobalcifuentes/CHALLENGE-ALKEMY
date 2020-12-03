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
@Table(name = "teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_teacher")
	@SequenceGenerator(name = "seq_teacher", sequenceName = "seq_teacher", allocationSize = 1, initialValue= 5)
	@Column(name = "teacher_id")
	private int id;
	
	@Column(name = "name", nullable = false, length = 72)
	private String name;
	
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	
	@Column(name = "dni", nullable = false, length = 20)
	private String DNI;
	
	@ManyToOne
	@JoinColumn(name = "enabled_id", nullable = false, foreignKey = @ForeignKey(name = "FK_teacher_enabled"))
	private Enabled enabled;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Enabled getEnabled() {
		return enabled;
	}

	public void setEnabled(Enabled enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", lastName=" + lastName + ", DNI=" + DNI + ", enabled="
				+ enabled + "]";
	}
	
	
	
	
	
	

}
