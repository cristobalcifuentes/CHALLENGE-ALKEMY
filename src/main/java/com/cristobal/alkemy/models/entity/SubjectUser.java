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
@Table(name= "subject_user")
@IdClass(PKSubjectUser.class)
public class SubjectUser implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="subject_id", foreignKey = @ForeignKey(name = "FK_subject_user_subject"))
	private Subject subject;
	
	@Id
	@ManyToOne
	@JoinColumn(name="user_id", foreignKey = @ForeignKey(name = "FK_subject_user_user"))
	private User user;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "SubjectUser [subject=" + subject + ", user=" + user + "]";
	}
	
	
	
	

}
