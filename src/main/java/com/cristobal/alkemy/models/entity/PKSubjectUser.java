package com.cristobal.alkemy.models.entity;

import java.io.Serializable;

public class PKSubjectUser implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int subject;
	
	private int user;

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + subject;
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
		PKSubjectUser other = (PKSubjectUser) obj;
		if (subject != other.subject)
			return false;
		if (user != other.user)
			return false;
		return true;
	}

	public PKSubjectUser(int subject, int user) {
		this.subject = subject;
		this.user = user;
	}

	public PKSubjectUser() {
	}

	@Override
	public String toString() {
		return "PKSubjectUser [subject=" + subject + ", user=" + user + "]";
	}
	
	
	
	
	
	
	
	

}
