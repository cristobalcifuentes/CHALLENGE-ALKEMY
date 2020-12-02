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
@Table(name= "subject_teacher")
@IdClass(PKSubjectTeacher.class)
public class SubjectTeacher implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	@JoinColumn(name="subject_id", foreignKey = @ForeignKey(name = "FK_subject_teacher_subject"))
	private Subject subject;
	
	@Id
	@ManyToOne
	@JoinColumn(name="teacher_id", foreignKey = @ForeignKey(name = "FK_subject_teacher_teachers"))
	private Teacher teacher;

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "SubjectTeacher [subject=" + subject + ", teacher=" + teacher + "]";
	}
	
	
	
	
	
	

}
