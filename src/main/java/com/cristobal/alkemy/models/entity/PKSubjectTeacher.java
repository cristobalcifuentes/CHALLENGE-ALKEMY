package com.cristobal.alkemy.models.entity;

import java.io.Serializable;

public class PKSubjectTeacher implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private int subject;
	
	private int teacher;

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public int getUser() {
		return teacher;
	}

	public void setUser(int user) {
		this.teacher = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + subject;
		result = prime * result + teacher;
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
		PKSubjectTeacher other = (PKSubjectTeacher) obj;
		if (subject != other.subject)
			return false;
		if (teacher != other.teacher)
			return false;
		return true;
	}
	
	
	
	

}
