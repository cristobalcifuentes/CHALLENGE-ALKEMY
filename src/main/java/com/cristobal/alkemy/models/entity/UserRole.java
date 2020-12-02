package com.cristobal.alkemy.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "users_role")
@IdClass(PKUserRole.class)
public class UserRole implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="user_id", foreignKey = @ForeignKey(name = "FK_user_role_user"))
	private User user;
	
	@Id
	@ManyToOne
	@JoinColumn(name="role_id", foreignKey = @ForeignKey(name = "FK_user_role_role"))
	private Role role;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
