package com.cristobal.alkemy.models.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_user")
	@SequenceGenerator(name = "seq_user", sequenceName = "seq_user", allocationSize = 1, initialValue= 5)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "name", nullable = false, length = 20)
	private String name;
	
	@Column(name = "last_name", nullable = false, length = 20)
	private String lastName;
	
	@Column(name = "rut", nullable = false, length = 20)
	private String rut;
	
	@Column(name= "password", nullable = false)
	private String password;
	
	@JsonIgnore
//@Transient
	@OneToMany(mappedBy="user", fetch = FetchType.EAGER)
	private Set<UserRole> roles = new HashSet<>();
	

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

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<UserRole> getRoles() {
		

		return roles;
	}

	public void setRoles(Set<UserRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", rut=" + rut + ", password="
				+ password + "]";
	}


	

}
