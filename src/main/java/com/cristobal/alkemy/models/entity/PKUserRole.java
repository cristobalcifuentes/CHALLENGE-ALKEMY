package com.cristobal.alkemy.models.entity;

import java.io.Serializable;

public class PKUserRole implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int user;
	
	private int role;

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + role;
		result = prime * result + user;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PKUserRole other = (PKUserRole) obj;
		if (role != other.role)
			return false;
		if (user != other.user)
			return false;
		return true;
	}

	public PKUserRole(int user, int role) {
		this.user = user;
		this.role = role;
	}

	public PKUserRole() {
	}
	
	
	
	

}
